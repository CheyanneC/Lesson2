import hsa.*;

public class Momentum 
{
    public static void main(String[] args) 
    {
        Console c = new Console();
        
        double mass, vel, mom;
        
        c.print("Enter object's mass in kilograms: ");
        mass = c.readDouble(); //collect input
        
        c.print("Enter object's velocity in meters per second: ");
        vel = c.readDouble(); //collect input
        
        mom = mass * vel; //calculate momentum
        
        c.print("\n\nThe momentum of your object is " + mom); //output the answer
    }
    
}
