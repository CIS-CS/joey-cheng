import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tower here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tower extends Actor
{
    private String color;  
    private static final double WIDTH = 3.0; // initialize in constructor, static so that you can
    private static final double HEIGHT = 33.0; // call Tower.WIDTH; 
    private boolean isSelected = false;
    
    //constructor for Tower class
    public Tower()
    {
        color = getColor();
        isSelected = getIsSelected();
    }
    
    //Get and set-methods for all instance variables of Tower class
    public void setColor (String color)
    {
        color = this.color;
    }
    
    public String getColor ()
    {
        return color;
    }
    
    public void setWIDTH (double WIDTH)
    {
        WIDTH = this.WIDTH;
    }
    
    public double getWIDTH ()
    {
        return WIDTH;
    }
    
    public void setHEIGHT (double HEIGHT)
    {
        HEIGHT = this.HEIGHT;
    }
    
    public double getHEIGHT ()
    {
        return HEIGHT;
    }
    
    public void setIsSelected (boolean isSelected)
    {
        isSelected = this.isSelected;
    }
    
    public boolean getIsSelected()
    {
        return isSelected;
    }
    
    //method for highlighting Tower when cursor hovers over it.
    public void highlightTower()
    {
    }
    
    
    
    
           
    /**
     * Act - do whatever the Tower wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
