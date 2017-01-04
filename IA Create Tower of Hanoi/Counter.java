import greenfoot.*;

public class Counter extends Actor
{
    private int moveCount;      // move count
    private String caption;    // text display on counter
    
    public Counter(String text)
    {
        caption = text; 
        updateImage();  // creates image for  counter   
    }

    /**
     * returns current move count
     */
    public int getMoveCount()
    {
        return moveCount;
    }
    
    /**
     * increments and returns updated move count
     */
    public int increment()
    {
        moveCount++;
        updateImage();
        return moveCount;
    }
    
    /**
     * updates image of the counter
     */
    public void updateImage()
    {
        setImage(new GreenfootImage(caption+moveCount, 24, java.awt.Color.black, null));        
    }
  
    
}