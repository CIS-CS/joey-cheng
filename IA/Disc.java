import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Disc here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Disc extends Actor
{
    private String color;
    private double width = 10.0;
    private double HEIGHT = 3.0;
    private boolean canMove = false;
    private boolean isSelected = false;   
    //Constructor for Disc
    public Disc()
    {
        color = getColor();
        width = getWidth();
        HEIGHT = getHEIGHT();
        canMove = getCanMove();
        isSelected = getIsSelected();
    }
    
    //Get and set-methods for all instance variables of Disc class
    public void setColor (String color)
    {
        color = this.color;
    }
    
    public String getColor ()
    {
        return color;
    }
    
    public void setWidth (double width)
    {
        width = this.width;
    }
    
    public double getWidth ()
    {
        return width;
    }
    
    public void setHEIGHT (double height)
    {
        HEIGHT = height;
    }
    
    public double getHEIGHT ()
    {
        return HEIGHT;
    }
    
    public void setCanMove (boolean canMove)
    {
        canMove = this.canMove;
    }
    
    public boolean getCanMove()
    {
        return canMove;
    }
    
    public void setIsSelected (boolean isSelected)
    {
        isSelected = this.isSelected;
    }
    
    public boolean getIsSelected()
    {
        return isSelected;
    }
    
    /**When a mouse hovers over the disc, the disc changes to a green color. 
     * 
     * 
     */
    
    public void highlightDisc()
    {
    }
    
    /**
     * Act - do whatever the Disc wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
