import greenfoot.*;

public class Arrow extends Actor
{
    // set and create the image of a triangle for this arrow
    public Arrow()
    {
        //indicates x and y coordinates for the three vertices of the triangle
        int x[] = { 0, 15, 25 }, y[] = { 10, 0, 10 }; 
        GreenfootImage image = new GreenfootImage(25, 15);
        image.setColor(java.awt.Color.red);
        //creates polygon by indicating the x, y coordinates and the number of sides for the triangle
        image.fillPolygon(x, y, 3);
        setImage(image);
    }
}