public class RoadBike extends Bicycle {
        
    // the MountainBike subclass adds one field
    private int seatHeight;
    private int cadence;
    private int gear;
    private int speed;
   
    // the MountainBike subclass has one constructor
    public RoadBike(int startHeight,
                        int startCadence,
                        int startSpeed,
                        int startGear) {
        super(startCadence, startSpeed, startGear);
        seatHeight = startHeight;
        cadence = getCadence();
        gear = getGear();
        speed = getSpeed();
        
    }   
        
    // the MountainBike subclass adds one method
    public void setHeight(int newValue) {
        seatHeight = newValue;
    }   
    
}