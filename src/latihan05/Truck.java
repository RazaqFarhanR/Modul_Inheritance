package latihan05;
public class Truck {
    
    //The Truck class has three fields
    public int cadence;
    public int gear;
    public int speed;
    //the Truck class has one constructor
    public Truck (int startCadence, int startSpeed, int startGear)
    {
    gear = startGear;
    cadence = startCadence;
    speed = startSpeed;
    }        
    //the truck class has four method
    public void setCandence (int newValue)
    {
    cadence = newValue;   
    }
    public void setGear (int newValue)
    {
        gear = newValue;
    }        
    public void applybrake (int decrement)
    {
    speed = decrement;    
    }        
    public void speedUp(int increment)
    {
    speed = increment;    
    }        
}
