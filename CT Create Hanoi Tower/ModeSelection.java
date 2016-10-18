import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.awt.MouseInfo;
/**
 * Write a description of class ModeSelection here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ModeSelection extends Actor
{
    private boolean isPlaySelected = false;
    private boolean isSimulationSelected = true;
    private GreenfootImage image = new GreenfootImage ("Play", 20, Color.BLACK , Color.WHITE);
    
    //constructor for ModeSelection class
    public ModeSelection()
    {
        isPlaySelected = getIsPlaySelected();
        isSimulationSelected = getIsSimulationSelected();
        image = new GreenfootImage ("Simulation", 20, Color.BLACK, Color.WHITE);
        image.drawImage (image, 100, 100);
    }
    
    //get and set-methods for instance variables of ModeSelection class
    public void setIsPlaySelected(boolean isPlaySelected)
    {
        isPlaySelected = this.isPlaySelected;
    }
    
    public boolean getIsPlaySelected()
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
        
    /**
     * Act - do whatever the ModeSelection wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        image.drawImage (image, 100, 100);
        if (Greenfoot.mouseClicked(image) && isSimulationSelected == true)
        {
            image = new GreenfootImage ("Simulation", 20, Color.BLACK, Color.WHITE);
            setIsSimulationSelected(false);
            setIsPlaySelected(true);
        }
        
        if (Greenfoot.mouseClicked(image) && isPlaySelected == true)
        {
            image = new GreenfootImage ("Play", 20, Color.BLACK, Color.WHITE);
            setIsSimulationSelected(true);
            setIsPlaySelected(false);
        }    
    }
}
