import greenfoot.*;
import java.awt.Color;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TowerOfHanoi extends World
{
    public static int discCount; //maximum number of rings
    public static boolean simulation; //mode set for this world
    private Disc[] sizeOrder; //lists discs by size
    private Disc[][] discOrder; // tracks arrangement of discs
    private int[] numberOfDiscs; // tracks number of discs on peg
    Counter counter; //track and show move count
    ModeSelection mode; //button to toggle between 'play' and 'simulation
    Timer timer; //creates timer
     
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public TowerOfHanoi()
    {    
        super(1100, 700, 1); 
        setBackground();
        discCount = 10;
        simulation = true;
        sizeOrder = new Disc[discCount];
        discOrder = new Disc[3][discCount];
        numberOfDiscs = new int [3];
        mode = new ModeSelection();
        timer = new Timer();
        populateWorld();
      
    }
    /**
     * sets default appearance when application is first launched
     */
    public void setBackground()
    {
       GreenfootImage background = getBackground();
        //draws the towers   
        background.setColor(new Color(200, 100, 100));
        background.fillRect(150, 600, 800, 30);
        background.setColor(new Color(100, 50, 50));
        background.fillRect(250, 110, 45, 500);
        background.fillRect(525, 110, 45, 500);
        background.fillRect(800, 110, 45, 500);
        //draws the text of the buttons
        GreenfootImage text = new GreenfootImage ("Use number buttons '3' to '0' to adjust ring count. Press '0' if you want ten discs", 24, Color.red, null);
        background.drawImage (text, 150, 10);
        text = new GreenfootImage ("Click button to toggle between simulation and play modes", 24, Color.blue, null);
        background.drawImage (text, 270, 40);
        text = new GreenfootImage ("Amount of discs: " + discCount, 24, Color.green, null);
        background.drawImage (text, 10, 40);
        
        //draws the discs
        /*background.setColor(new Color (200, 10, 10));
        background.fillRect(185, 575, 180, 30);
        background.setColor(new Color (170, 20, 15));
        background.fillRect(195, 545, 160, 30);
        background.setColor(new Color (140, 30, 20));
        background.fillRect(205, 515, 140, 30);
        */

    }
    
    public void displayHelp()
    {
        //displays instructions 
        GreenfootImage background = getBackground();
        background.setColor(Color.white);
        background.fillRect (0, 355, 390, 40);
        GreenfootImage text = null;
        if (simulation)
        {
            text = new GreenfootImage ("Press 'space' to display next move", 24, Color.black, null);
        }
        else
        {
            text = new GreenfootImage ("Click on towers that you wish to move from and to", 24, Color.black, null);
        }
        background.drawImage (text, 375, 650);
        
    }
    
    
    /**
     *populate method to add all actors
     */
    public void populateWorld() 
    {
        // adding the discs to arrays
        for (int a = 0; a < discCount; a++)
        {
            discOrder[0][a] = new Disc (discCount-1-a);
            addObject (discOrder[0][a], 275, 590-25*a);
            addDisc (0, discOrder[0][a]);
            sizeOrder[discCount-1-a] = discOrder[0][a];
        }
        // adding the button toggling between modes
        addObject (mode, 550, 80);
        // adding the counter displaying moves
        counter = new Counter ("Moves used: ");
        addObject (counter, 80, 25);
        // shows instructions
        displayHelp();
    }
    
    /**
     * adds a disc to the tower in the array that tracks arrangement of discs
     */
    private void addDisc (int towerNumber, Disc disc)
    {
        discOrder [towerNumber][numberOfDiscs[towerNumber]] = disc;
        numberOfDiscs[towerNumber]++;
    }
    
    private Disc removeDisc (int towerNumber)
    {
        Disc disc = discOrder[towerNumber][numberOfDiscs[towerNumber]-1];
        numberOfDiscs[towerNumber]--;
        return disc;
    }
    /**
     * Checks if keys and buttons are pressed and subsequently execute moves 
     * and make changes accordingly to the user interface
     */
  
    public void act()
    {
        String key = Greenfoot.getKey();
        if (key != null && "34567890".indexOf(key) >= 0)
        {
            discCount = "34567890".indexOf(key)+3;
            Greenfoot.setWorld(new TowerOfHanoi());
        }
        if (simulation && "space".equals(key))
        {
        }
       // if (simulation && space
    }
        /**
         * interacts with ModeSelection class
         */
     /*   ModeSelection mode = new ModeSelection();
        world.setColor(new Color(200, 100, 100));
        world.drawString("Simulation", 20, 20);
        Help help = new Help();
        Timer timer = new Timer();
        /**
         * creates 'Start' button
         */
        
        /*
        if (Greenfoot.isKeyDown("p") && mode.getIsSimulationSelected() == true)
        {
            mode.setIsSimulationSelected(false);
            mode.setIsPlaySelected(true);
            world.drawString("Play", 20, 20);
        }
        
        if (Greenfoot.isKeyDown("p") && mode.getIsPlaySelected() == true)
        {
            mode.setIsSimulationSelected(true);
            mode.setIsPlaySelected(false);
            world.drawString("Simulation", 20, 20);
        }    
  
    }
    
    public void act()
    {
        
    }
    
*/
}
