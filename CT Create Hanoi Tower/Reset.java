import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Exit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Reset extends Actor
{
    private boolean isRPressed = false;
    
    //constructor for Exit class
    public Reset()
    {
        isRPressed = getIsRPressed();
    }
    
    //get and set-methods for instance variables of Exit class
    public void setIsRPressed (boolean isRPressed) // SHOULD USE THE ISKEYDOWN METHOD TO CREATE
    {
        isRPressed = this.isRPressed;
    }
    
    public boolean getIsRPressed()
    {
        return isRPressed;
    }
    
    //method resetting game, returning all instance variables to default values
    public void reset()
    {
    }
    
    /**
     * Act - do whatever the Exit wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
