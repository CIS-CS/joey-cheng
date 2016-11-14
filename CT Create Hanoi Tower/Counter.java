import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Counter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Counter extends Actor
{
    private String text;
    private int count; //count shown on counter
    
    public Counter (String caption)
    {
        text = caption;
        updateImage();
    }
    /**
     * creates or updates moves displayed by counter
     */
    public void updateImage()
    {
       setImage (new GreenfootImage (text+count, 24, java.awt.Color.black, null));
    }
    
    public int increment()
    {
        count++;
        updateImage();
        return count;
    }
    /**
     * returns value of moves
     */
    public int getCount()
    {
        return count;
    }
    
       
      //  setImage (new GreenfootImage (text + caption, 25, java
    /*private int movesPerformed = 0;
    
    public Counter()
    {
        movesPerformed = getMovesPerformed();
    }
    
    //get and set-methods for instance variables of Counter class
    public void setMovesPerformed (int movesPerformed)
    {
        movesPerformed = this.movesPerformed;
    }
    
    public int getMovesPerformed()
    {
        return movesPerformed;
    }
    
    //increments counter value by one
    public int countUp()
    {
        movesPerformed++;
        return movesPerformed;
    }
    
    //decreases counter value by one 
    public int countDown()
    {
        movesPerformed--;
        return movesPerformed;
    }
           
    /**
     * Act - do whatever the Counter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    //public void act() 
   }   
        // Add your action code here.
      

