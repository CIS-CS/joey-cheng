import greenfoot.*;  
import java.awt.Color;
import java.awt.Font;

/**
 * Displays a message on the screen.
 * Position the message when the PopUpMessage object is added to the world.
 * 
 * @author Mark Hayes
 * @version 1.1
 */
public class PopUpMessage extends Actor
{
    public PopUpMessage(String message)
    {
        // create an image object: message, fontSize, fg color, bg color
        GreenfootImage image = new GreenfootImage(message, 20, Color.BLACK, Color.WHITE);

        // set the font details for the image
        Font font = new Font("Arial", Font.BOLD, 20);
        image.setFont(font);
        
        // draw a red border on the image
        image.setColor(Color.RED);
        image.drawRect(0, 0, image.getWidth()-1, image.getHeight()-1);
        
        // assign the image to the actor
        setImage(image);
    }
    
    public void act() {
        // this actor does not do anything.
    }

}
