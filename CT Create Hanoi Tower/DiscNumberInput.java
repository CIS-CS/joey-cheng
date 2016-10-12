import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DiscNumberInput here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DiscNumberInput extends Actor
{
    private int discNumber = 3;
    private int DISCNUMBERLIMIT = 10;
    
    //get and set methods for instance variables
    public void setDiscNumber (int discNumber) //WILL NEED USER INPUT FOR THIS ONE
    {
        discNumber = this.discNumber;
        if (this.discNumber > 10) //MAYBE TEXTBOX INSTEAD
        {
            System.out.println("This is not a valid number. Maximum amount of discs is 10");
        }
    }
    
    public int getDiscNumber()
    {
        return discNumber;
    }
    
    public void setDISCNUMBERLIMIT (int DISNUMBERLIMIT)
    {
        DISCNUMBERLIMIT = this.DISCNUMBERLIMIT;
    }
    
    public int getDISCNUMBERLIMIT()
    {
        return DISCNUMBERLIMIT;
    }
    
    /**
     * Act - do whatever the DiscNumberInput wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
