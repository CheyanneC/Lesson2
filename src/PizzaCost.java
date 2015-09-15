import hsa.*;

public class PizzaCost 
{
    public static void main(String[] args) 
    {
        Console c = new Console();
        
        double labor = 1.50, util = .50, base = .50, top, topprice = .75, size, total; 
        //allow for user to change cost easier
        
        c.println("Welcome to Joey's Pizzera! What could we get started for you?");
        
        c.print("Size of your pizza (in inches): "); //ask for size
        size = c.readDouble();
        
        c.print("Number of toppings: "); //ask for # of toppings
        top = c.readDouble();
        
        total = labor + util + ((base * 2) * size) + (top * topprice); //calculate total
        
        c.print("\nYour total is : " + total); //output total
    }
    
}
