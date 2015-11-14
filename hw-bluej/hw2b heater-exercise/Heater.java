
/**
 * Write a description of class Heater here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Heater
{
    // instance variables - replace the example below with your own
    private double temperature;
    private double min;
    private double max;
    private double increment;
    
    public Heater (double setMin, double setMax)
    {
        temperature = 15.0;
        min = setMin;
        max = setMax;
        increment = 5.0;
    }
    
    public void warmer ()
    {
        temperature = temperature + increment;
        
        if (temperature > max)
            temperature = max;
        
    }
    
    public void cooler ()
    {
        temperature = temperature - increment;
        
        if (temperature < min)
            temperature = min;
    }
    
    public double getTemperature()
    {
        return temperature;
    }
    
    public boolean setIncrement (double increase)
    {
        if (increase <= 0)
        return false;
        else
        increment = increase;
        return true;
    }
    
}
