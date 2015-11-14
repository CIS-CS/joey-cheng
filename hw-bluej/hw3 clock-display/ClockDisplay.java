
/**
 * The ClockDisplay class implements a digital clock display for a
 * European-style 24 hour clock. The clock shows hours and minutes. The 
 * range of the clock is 00:00 (midnight) to 23:59 (one minute before 
 * midnight).
 * 
 * The clock display receives "ticks" (via the timeTick method) every minute
 * and reacts by incrementing the display. This is done in the usual clock
 * fashion: the hour increments when the minutes roll over to zero.
 * 
 * @author Michael Kölling and David J. Barnes
 * @version 2011.07.31
 */
public class ClockDisplay
{
    private NumberDisplay hours;
    private NumberDisplay minutes;
    private String am;
    private String displayString;    // simulates the actual display
    
    /**
     * Constructor for ClockDisplay objects. This constructor 
     * creates a new clock set at 00:00.
     */
    public ClockDisplay()
    {
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        am = "a.m.";
        updateDisplay();
        displayString = "12:00" + " " + "a.m.";
    }

    /**
     * Constructor for ClockDisplay objects. This constructor
     * creates a new clock set at the time specified by the 
     * parameters.
     */
    public ClockDisplay(int hour, int minute, String meridian)
    {
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        am = meridian;
        setTime(hour, minute, meridian);
    }

    /**
     * This method should get called once every minute - it makes
     * the clock display go one minute forward.
     */
    public void timeTick()
    {
        minutes.increment();
        if(minutes.getValue() == 0) {  // it just rolled over!
            hours.increment();
        }
        
        if (hours.getValue() == 12 && minutes.getValue() == 0 && am == "a.m.")
        {
            am = "p.m.";
        }
        
        else if (hours.getValue() == 12 && minutes.getValue() == 0 && am == "p.m.")
        {
            am = "a.m.";
        }
        updateDisplay();
    }

    /**
     * Set the time of the display to the specified hour and
     * minute.
     */
    public void setTime(int hour, int minute, String meridian)
    {
        hours.setValue(hour);
        minutes.setValue(minute);
        am = meridian;
        updateDisplay();
    }

    /**
     * Return the current time of this display in the format HH:MM.
     */
    public String getTime()
    {
        return displayString;
    }
    
    /**
     * Update the internal string that represents the display.
     */
    private void updateDisplay()
    { 
        int hour = Integer.parseInt (hours.getDisplayValue());
        
       
        if (hour == 0)
        {
            displayString = "12" + ":" + minutes.getDisplayValue() + " " + "a.m.";
        }
            
        if (hour > 12)
        {
            displayString = (hour-12) + ":" + minutes.getDisplayValue() + " " + am;
        }
        
       {
           displayString = hour  + ":" + minutes.getDisplayValue() + " " + am;
       }
    }
}

