import greenfoot.*;
import java.awt.Color;

public class TowerOfHanoi extends World
{
    public  static int discCount = 10;                      // number of discs in the game
    private Disc[] sizeOrder = new Disc[discCount];         // lists discs by size
    private Disc[][] discOrder = new Disc[3][discCount];    // tracks the arrangement of discs on each tower
    private int[] numberOfDiscs = new int[3];               // tracks the number of discs on each tower
    
    public  static boolean simulation = false;              // mode set for this world

    Counter counter;                                        // move counter
    ModeButton button = new ModeButton();                   // button to toggle between play and simulation mode
    PopUpMessage message = new PopUpMessage("Click on yellow button to change game modes \n Move all discs from one tower to another \n A bigger disc cannot be placed on a smaller one \n Use buttons '3' to '9' to change number of discs. Press '0' for ten discs");              // pop-up message displaying user instructions
    PopUpMessage gameComplete = new PopUpMessage("Move complete! Press 'r' to restart.");
    PopUpMessage warning = new PopUpMessage("Illegal move!");
    PopUpMessage cannotMove = new PopUpMessage("Disc cannot be moved!");
    public TowerOfHanoi() 
    {
        super(800, 480, 1);
        drawBackground();
        populateWorld();
    }

    /**
     * draws default background image for this world
     */
    private void drawBackground() 
    {
        GreenfootImage bg = getBackground();
        // creates towers
        bg.setColor(Color.black);
        bg.fillRect(50,400,700,30);
        bg.fillRect(175,80,45,350);
        bg.fillRect(375,60,45,350);
        bg.fillRect(575,60,45,350);
        // displays number of discs
        GreenfootImage text = new GreenfootImage("Discs: "+ discCount, 24, Color.black, null);
        bg.drawImage(text, 700, 10);
    }
    
    /**
     * shows corresponding instructions depending on game mode (simulation mode or play mode)
     */
    public void showInstructions()
    {
        GreenfootImage bg = getBackground();
        // inserts instruction text into background
        GreenfootImage text = null;
        if (simulation) 
        {
            text = new GreenfootImage("Press 'space' to simulate next move\nHold 'h' for help", 24, Color.red, null);
        }
        else
        {
            text = new GreenfootImage("Click on towers to select from and to\nHold 'h' for help", 24, Color.red, null);
        }
        bg.drawImage(text, 220, 10);
    }
    
    /**
     * adds discs, move counter and mode button into this world
     */
    private void populateWorld() 
    {
        //adds discs to arrays and creates images of them on the user interface 
        for (int index=0; index<discCount; index++)
        {
            discOrder[0][index] = new Disc(discCount-1-index);
            addObject(discOrder[0][index], 200, 400-30*index);
            addDisc(0, discOrder[0][index]);
            sizeOrder[discCount-1-index] = discOrder[0][index];
        }
        // adds move counter
        counter = new Counter("Moves: ");
        addObject(counter, 50, 20);
        // button to toggle between modes
        addObject(button, 400, 450);
        showInstructions();
    }
    
    /**
     * removes the top disc and returns the disc removed from the array noting arrangement on actual tower 
     * 
     */
    private Disc removeDisc(int towerNumber) 
    {
        //comment here
        Disc disc = discOrder[towerNumber][numberOfDiscs[towerNumber]-1];
        numberOfDiscs[towerNumber]--;
        return disc;
    }
    
    /**
     * adds disc to top of array noting arrangement on actual tower
     */
    private void addDisc(int towerNumber, Disc disc) 
    {
        discOrder[towerNumber][numberOfDiscs[towerNumber]] = disc;
        numberOfDiscs[towerNumber]++;
    }
    
    /**
     * determines if game is completed
     */
    private boolean gameCompleted() 
    {
        return (numberOfDiscs[1] == discCount) || (numberOfDiscs[2] == discCount);
    }
    
    /**
     * runs animation of moving disc from one tower to another 
     */
    private void moveDisc(Disc disc, int from, int to) 
    {
        // raises disc off original tower
        while (disc.getY() != 30)
        {
            disc.setLocation(disc.getX(), disc.getY()-10);
            Greenfoot.delay(1);
        }
        // moves disc horizontally to top of new tower
        // determines if disc should move left or right
        int direction = (int)Math.signum(to-from); 
        while (disc.getX() != 200+200*to)
        {
            disc.setLocation(disc.getX()+direction*10, disc.getY());
            Greenfoot.delay(1);
        }
        // lower disc on new tower
        // determines the position of the disc on the new tower and moves disc accordingly
        int targetY = 400-30*(numberOfDiscs[to]); 
        while (disc.getY() != targetY)
        {
            disc.setLocation(disc.getX(), disc.getY()+10);
            Greenfoot.delay(1);
        }
    }
    
    /**
     * this is a method for simulation mode only, checks if simulation is completed before running next move 
     * the disc to move is determined by the move number (lowest power of two that goes into movecount);
     * the direction to move (right or left) is determined by the size index of disc (odd or even)
     */
    private void makeMove() 
    {
        // increments move count
        int moves = counter.increment(); 
        // determine 'from' tower
        int index = discCount-1;
        while (moves%(int)Math.pow(2, index) != 0)
        {
            index--;
        }
        int from = (sizeOrder[index].getX()-200)/200;
        // remove disc from 'from' tower
        Disc ring = removeDisc(from);
        // determine 'to' tower
        int to = (from+4-2*(ring.getIndex()%2))%3;
        // move disc from 'from' tower to 'to' tower
        moveDisc(ring, from, to);
        // add disc to 'to' tower 
        addDisc(to, ring);
    }
    
     /**
     * in play mode, determines if there is a top disc on the selcted tower, and if so, whether it can be moved to the
     * next tower
     */
    private boolean validateMove(int from, int to) 
    {
        return numberOfDiscs[to] == 0 || discOrder[from][numberOfDiscs[from]-1].getIndex() < discOrder[to][numberOfDiscs[to]-1].getIndex();
    }
    
     /**
     * executes a legal, user determined move in play mode
     */
    private void executeMove(int from, int to)
    {
        counter.increment();
        Disc ring = removeDisc(from);
        moveDisc(ring, from, to);
        addDisc(to, ring);
    }
    
    /**
     * this is a method for play mode only,executes a manual move in play mode only if it is a valid move, 
     * removes arrow after the move
     * checks for puzzle completion. If completed, displays pop-up message.
     */
    private void processMove(int to) 
    {
        int from = (((Actor)getObjects(Arrow.class).get(0)).getX()-200)/200;
        if (validateMove(from, to)) 
        {
            executeMove(from, to);
        }
        else
        {
            addObject(warning, 400, 240);
            Greenfoot.delay(800);
            removeObject(warning);
        }
        removeObjects(getObjects(Arrow.class));
        if (gameCompleted()) 
        {
            addObject(gameComplete, 400, 240);
        }
    }
    
     /**
     * in play mode, adds an arrow to clicked tower if top disc can move 
     */
    private void addArrow(int from) 
    {
        // check if 'from' tower has a disc to move
        if (numberOfDiscs[from] == 0) return;
        // check if disc on 'from' tower can move anywhere
        if (validateMove(from, (from+1)%3) || validateMove(from, (from+2)%3)) 
        {
            addObject(new Arrow(), 200+200*from, 400);
        }
        else
        {
            addObject(cannotMove, 240, 200);
            Greenfoot.delay(800);
            removeObject(cannotMove);
        }
    }
    
    /**
     * checks for buttons pressed for setting number of discs, automatic simulation, or manually solving the game. 
     */
    public void act() 
    {
        String key = Greenfoot.getKey();
        // adjusts number of discs in the game according to button pressed by the user
        if (key != null && "34567890".indexOf(key) >= 0)
        {
            discCount = "34567890".indexOf(key)+3;
            Greenfoot.setWorld(new TowerOfHanoi());
        }
        // automatically moves disc if simulation is not complete, and if space button is pressed and user is in simulation mode
        if (simulation && "space".equals(key)) 
        {
            if (gameCompleted()) 
            {
                addObject(gameComplete, 400, 240);
            }
            else
            {
                makeMove();
            }
        }
        // determines if user has clicked on the towers, and moves discs accordingly
        if (!simulation && !gameCompleted() && Greenfoot.mouseClicked(null) && !Greenfoot.mouseClicked(button))
        {
            MouseInfo mouse = Greenfoot.getMouseInfo();
            int mx = mouse.getX(), my = mouse.getY();
            // determines which tower the user has selected according to where the mouse click occurred   
            if (mx > 100 && mx < 700 && my > 100 && my < 500)
            {
                int towerNumber = (mx-100)/200;
                // determines if the tower user selected is a 'from' tower or a 'to' tower
                if (getObjects(Arrow.class).isEmpty())
                {
                    addArrow(towerNumber);
                }
                else
                {
                    // moves disc if user has selected a 'to' tower
                    processMove(towerNumber);
                }
            }
        }
        // determines if the 'h' buttons is held and displays user instructions
        if (Greenfoot.isKeyDown("h"))
        {
            addObject (message, 400, 240);
        }
        else
        {
            removeObject(message);
        }
        // in play mode, determines if game is completed and wheter user wishes to play once more
        if (gameCompleted() && "r".equals(key))
        {
            Greenfoot.setWorld(new TowerOfHanoi());
        }  
    }  
}