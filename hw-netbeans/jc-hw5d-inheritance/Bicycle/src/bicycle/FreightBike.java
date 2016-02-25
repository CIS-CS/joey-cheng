public class FreightBike extends Bicycle {
        
    // the MountainBike subclass adds one field
    private int seatHeight;
    private int cadence;
    private int gear;
    private int speed;
    private int basketLoad;
   
    // the MountainBike subclass has one constructor
    public FreightBike (int startHeight,
                        int startCadence,
                        int startSpeed,
                        int startGear, 
                        int startLoad) {
        super(startCadence, startSpeed, startGear);
        seatHeight = startHeight;
        basketLoad = startLoad;
        cadence = getCadence();
        gear = getGear();
        speed = getSpeed();
        
    }   
        
    // the MountainBike subclass adds one method
    public void setHeight(int newValue) {
        seatHeight = newValue;
    }   
    
}