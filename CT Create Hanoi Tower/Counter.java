import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Counter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Counter extends Actor
{
    private int movesPerformed = 0;
    
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
    public void act() 
    {
        // Add your action code here.
    }    
}
