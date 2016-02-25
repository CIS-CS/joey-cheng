public class MountainBike extends Bicycle {
        
    // the MountainBike subclass adds one field
    private int seatHeight;
    private int tireThickness;
    private int cadence;
    private int gear;
    private int speed;
   
    // the MountainBike subclass has one constructor
    public MountainBike(int startHeight,
                        int startCadence,
                        int startSpeed,
                        int startGear,
                        int startThickness) {
        super(startCadence, startSpeed, startGear);
        seatHeight = startHeight;
        tireThickness = startThickness;
        cadence = getCadence();
        gear = getGear();
        speed = getSpeed();
        
    }   
        
    // the MountainBike subclass adds one method
    public void setHeight(int newValue) {
        seatHeight = newValue;
    }   
    
}