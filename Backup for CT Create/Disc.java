import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Disc here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Disc extends Actor
{
    private int index; //the position of the disc within an array set according to size
    
    public Disc (int number)
    {
        //Creates image of this ring
        GreenfootImage image = new GreenfootImage (30, 30);
        image.setColor (new java.awt.Color (60 + Greenfoot.getRandomNumber(120),
                                            60 + Greenfoot.getRandomNumber(120),
                                            60 + Greenfoot.getRandomNumber(120)));
        image.fillRect(0, 0, 25, 25);
        while (image.getWidth() < (number+3)*20)
        {
            image.scale (image.getWidth()+1, image.getHeight());
        }
        setImage(image);
        //stores index of ring
        index = number; 
    }
    
    /*
     * returns index of ring (0 smallest)
     */
    public int getIndex()
    {
        return index;
    }
    
   
  
    
    /*
    private String color;
    private double width = 10.0;
    private double HEIGHT = 3.0;
    private boolean canMove = false;
    private boolean isSelected = false;   
    private int index;
    //Constructor for Disc
    public Disc(int number)
    {
        color = getColor();
        width = 10.0;
        HEIGHT = 3.0;
        canMove = false;
        isSelected = false;
        
        //creates image of this ring
        GreenfootImage image = new GreenfootImage (20, 20);
        image.setColor( new java.awt.Color (20 + Greenfoot.getRandomNumber(100), 20 + Greenfoot.getRandomNumber(100),
                                            20 + Greenfoot.getRandomNumber(100)));
        image.fillRect (0, 0, 30, 30);
        while (image.getWidth() < (number+3)*20)
        {
            image.scale(image.getWidth()+1, image.getHeight());
        }
        setImage(image);
        //saves index of disc
        index = number;
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
    
    public int getIndex()
    {
        return index;
    }
    
    /**When a mouse hovers over the disc, the disc changes to a green color. 
     * 
     * 
     */
}
