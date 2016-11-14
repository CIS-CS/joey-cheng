import greenfoot.*;
import java.awt.Color;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

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
    private GreenfootImage world;
    
    /** 
     * Constructor for Timer class
     */
 static Thread thread = new Thread();
 public void act() 
 {

 }
 
 public void start()  
 {
     GreenfootImage world = new GreenfootImage(200,200);
     for (int c = 0; c <= 1000000000; c++)
     {
         if (c % 60 == 0)
         {
             seconds++;
             world.setColor(new Color (140, 30, 20));
             world.drawString("" +c, 100, 100);
         }
     }
     

 }
   /* /**
     * Get and set-methods for instance variables in Timer class
     */
   /* public void setHours (int hours)
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
  
    
    /**
     * Starts timer
     */
    /*public void start()
    {
    }
    
    
    /**
     * Pauses timer
     */
  /*  public void stop()
    {
    }
    
    public void act() 
    {
        for 
        world.drawString(""+ 
        //returnTimeDifference();
     // GreenfootImage.drawString ();// Add your action code here.
    }    
    */ 
}

