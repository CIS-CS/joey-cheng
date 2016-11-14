import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.awt.MouseInfo;

/**
 * Toggles between different modes, Simulation and Play, depending on user selection
 */
public class ModeSelection extends Actor
{
    public ModeSelection()
    {
        //toggle between texts depending on mode selected by user
        String text = TowerOfHanoi.simulation ? "Simulation" : "Play";
        GreenfootImage textImage = new GreenfootImage(text, 20, Color.black, null);
        //draws default image of the button
        GreenfootImage image = new GreenfootImage (90, 20);
        image.setColor(Color.red);
        image.fill();
        image.setColor(Color.black);
        image.drawRect(0, 0, 100, 20);
        image.setColor(Color.blue);
        image.drawRect(2, 2, 90, 20);
        //draws default text
        image.drawImage(textImage, 50-textImage.getWidth()/2, 100-textImage.getHeight()/2);
        setImage(image);
    }
    
    /**
     * Toggles to new world whenever mode is changed
     */
    public void act()
    {
        if (Greenfoot.mouseClicked(this))
        {
            TowerOfHanoi.simulation = !TowerOfHanoi.simulation;
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
