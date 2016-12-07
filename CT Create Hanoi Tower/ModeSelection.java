import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.awt.MouseInfo;

/**
 * Toggles between different modes, Simulation and Play, depending on user selection
 */
public class ModeSelection extends Actor
{
    private String text;
    private boolean isSimulation;
    public ModeSelection()
    {
        //toggle between texts depending on mode selected by user
        text = "Simulation";
        isSimulation = true;
        //textSimulation = "Play";
        GreenfootImage textImage = new GreenfootImage(text, 20, Color.black, null);
        //draws default image of the button
        GreenfootImage image = new GreenfootImage (90, 20);
        image.setColor(Color.gray);
        image.fill();
        image.setColor(Color.black);
        image.drawRect(0, 0, 100, 20);
        image.setColor(Color.gray);
        image.drawRect(2, 2, 90, 20);
        //draws default text
        image.drawImage(textImage, 45-textImage.getWidth()/2, 10-textImage.getHeight()/2);
        setImage(image);
    }
    
    public ModeSelection(String text, boolean isSimulation)
    {
         //toggle between texts depending on mode selected by user
        isSimulation = this.isSimulation;
        text = this.text;
        //textSimulation = "Play";
        GreenfootImage textImage = new GreenfootImage(text, 20, Color.black, null);
        //draws default image of the button
        GreenfootImage image = new GreenfootImage (90, 20);
        image.setColor(Color.gray);
        image.fill();
        image.setColor(Color.black);
        image.drawRect(0, 0, 100, 20);
        image.setColor(Color.gray);
        image.drawRect(2, 2, 90, 20);
        //draws default text
        image.drawImage(textImage, 45-textImage.getWidth()/2, 10-textImage.getHeight()/2);
        setImage(image);
    }
    
    public void setText(String text)
    {
        text = this.text;
    }
    
    public String getText()
    {
        return text;
    }
    
    public void setIsSimulation(boolean isSimulation)
    {
        isSimulation = this.isSimulation;
    }
    
    public boolean getIsSimulation()
    {
        return isSimulation;
    }
    
    /**
     * Toggles to new world whenever mode is changed
     */
    public void act()
    {
        if (Greenfoot.mouseClicked(this))
        {
            if (isSimulation == true)
            {
                isSimulation = false;
            }
            
            else if (isSimulation == false)
            {
                isSimulation = true;
            }
            Greenfoot.setWorld(new TowerOfHanoi());
        }
    }
   
        
   /* private boolean isPlaySelected; // variable name just playSelected
    private boolean isSimulationSelected;
    
    //constructor for ModeSelection class
    public ModeSelection()
    {
        isPlaySelected = false;
        isSimulationSelected = true;
  
    }
    
    //get and set-methods for instance variables of ModeSelection class
    public void setIsPlaySelected(boolean isPlaySelected)
    {
        isPlaySelected = this.isPlaySelected;
    }
    
    public boolean getIsPlaySelected() // remove get for boolean methods
    {
        return isPlaySelected;
    }
    
    public void setIsSimulationSelected(boolean isSimulationSelected)
    {
        isSimulationSelected = this.isSimulationSelected;
    }
    
    public boolean getIsSimulationSelected()
    {
        return isSimulationSelected;
    }
    
   public void act()
    {
        String key = Greenfoot.getKey();
        GreenfootImage world = new GreenfootImage (200,200);
        if (Greenfoot.isKeyDown("s") && getIsSimulationSelected() == true)
        {
            setIsSimulationSelected(false);
            setIsPlaySelected(true);
            world.drawString("Play", 20, 20);
        }
        
        if (Greenfoot.isKeyDown("p") && getIsPlaySelected() == true)
        {
            setIsSimulationSelected(true);
            setIsPlaySelected(false);
            world.drawString("Simulation", 20, 20);
        }    
    }
    
    /*public void setImage()
    {
        if (Greenfoot.mouseClicked(image) && isSimulationSelected == true)
        {
            image = new GreenfootImage ("Simulation", 20, Color.BLACK, Color.WHITE);
            image.drawImage(image, 10, 10);
            setIsSimulationSelected(false);
            setIsPlaySelected(true);
        }
        
        if (Greenfoot.mouseClicked(image) && isPlaySelected == true)
        {
            image = new GreenfootImage ("Play", 20, Color.BLACK, Color.WHITE);
            image.drawImage(image, 10, 10);
            setIsSimulationSelected(true);
            setIsPlaySelected(false);
        }    
    }
        
    /**
     * Act - do whatever the ModeSelection wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

}
