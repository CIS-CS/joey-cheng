import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * An arrow appears on whichever tower is selected
 * 
 * 
 */
public class Arrow extends Actor
{
    public Arrow()
    {
        int x[] = { 0, 10, 20 }, y[] = { 12, 0, 12 };
        GreenfootImage image = new GreenfootImage(20, 10);
        image.setColor(java.awt.Color.black);
        image.fillPolygon(x, y, 3);
        setImage(image);
    }
    
}
