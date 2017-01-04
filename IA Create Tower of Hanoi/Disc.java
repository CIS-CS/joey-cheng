import greenfoot.*;

public class Disc extends Actor
{
    private int index; // the smaller the index, the smaller the disc size, and the further up it is on the tower
    
    public Disc (int number)
    {
        // stores index of Disc
        index = number; 
        GreenfootImage image = new GreenfootImage (30, 30);
        // generates random color for the disc
        image.setColor (new java.awt.Color (60 + Greenfoot.getRandomNumber(120),
                                            60 + Greenfoot.getRandomNumber(120),
                                            60 + Greenfoot.getRandomNumber(120)));
        // draws the disc                                    
        image.fillRect(0, 0, 28, 28);
       // increases disc size according to their index number by scale 
        while (image.getWidth() < (number+3)*20)
        {
            image.scale (image.getWidth()+1, image.getHeight());
        }
        setImage(image);
    }
    
    /**
     * returns the index of the Disc (zero is smallest, increasing to largest)
     */
    public int getIndex()
    {
        return index;
    }
}