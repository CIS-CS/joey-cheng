import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Help here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Help extends Actor
{
    private boolean isHPressed = false;
    
    //constructor for Help class
    public Help()
    {
        isHPressed = getIsHPressed();
    }
    
    //get and set-methods for instance variables in Help class
    public void setIsHPressed (boolean isHPressed)
    {
        isHPressed = this.isHPressed;
    }
    
    public boolean getIsHPressed()
    {
        return isHPressed;
    }
    
    //shows instructions to help user in textbox
    public void printHelp()
    {
    
    
    }
   
        
    /**
     * Act - do whatever the Help wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
