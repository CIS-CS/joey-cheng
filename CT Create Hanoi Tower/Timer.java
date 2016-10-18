import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Timer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Timer extends Actor
{
    private int hours = 0;
    private int minutes = 0;
    private int seconds = 0;
    
    /** 
     * Constructor for Timer class
     */
    public Timer()
    {
        hours = getHours();
        minutes = getMinutes();
        seconds = getSeconds();
    }
    
    /**
     * Get and set-methods for instance variables in Timer class
     */
    public void setHours (int hours)
    {
        hours = this.hours;
    }
    
    public int getHours ()
    {
        return hours;
    }
    
    public void setMinutes (int minutes)
    {
        minutes = this.minutes;
    }
    
    public int getMinutes()
    {
        return minutes;
    }
    
    public void setSeconds (int seconds)
    {
        seconds = this.seconds;
    }
        
    public int getSeconds ()
    {
        return seconds;
        //if timeDifference  
    }
    
    /**
     * Returns time elapsed since timer was started
     */
  /*  public long returnTimeDifference()
    {
        int gameTimer = 0;
        gameTimer = (gameTimer + 1) % 60;
        if (gameTimer == 0) 
        {
            game
        
       
        
        
    }
    
    /**
     * Starts timer
     */
    public void start()
    {
    }
    
    
    /**
     * Pauses timer
     */
    public void stop()
    {
    }
    
    public void act() 
    {
        //returnTimeDifference();
     // GreenfootImage.drawString ();// Add your action code here.
    }    
}
