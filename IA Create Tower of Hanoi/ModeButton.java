import greenfoot.*;
import java.awt.Color;

public class ModeButton extends Actor
{
    public ModeButton()
    {
        // toggles between text according to game mode
        String text = TowerOfHanoi.simulation ? "Simulation" : "Play";
        GreenfootImage textImage = new GreenfootImage(text, 20, Color.black, null);
        // draws the button (a rectangle)
        GreenfootImage image = new GreenfootImage(100, 20);
        image.setColor(Color.yellow);
        image.fill();
        image.setColor(Color.black);
        image.drawRect(0, 0, 500, 24);
        // draws text exactly in the middle of the button  
        image.drawImage(textImage, 50-textImage.getWidth()/2, 10-textImage.getHeight()/2);
        setImage(image);
    }
    
    /**
     * listens for a mouse click on the button. If so, sets a new world with mode changed
     */
    public void act()
    {
        if (Greenfoot.mouseClicked(this))
        {
            TowerOfHanoi.simulation = !TowerOfHanoi.simulation; // change mode
            Greenfoot.setWorld(new TowerOfHanoi()); // creates new world
        }
    }
}