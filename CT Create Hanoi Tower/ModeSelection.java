import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

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
    
    //constructor for ModeSelection class
    public ModeSelection()
    {
        isPlaySelected = getIsPlaySelected();
        isSimulationSelected = getIsSimulationSelected();
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
        // Add your action code here.
    }    
}
