import hsa.*;

public class PizzaCost 
{
    public static void main(String[] args) 
    {
        Console c = new Console();
        
        double labor = 1.50, util = .50, base = .50, top, topprice = .75, size, total;
        
        c.println("Welcome to Joey's Pizzera! What could we get started for you?");
        
        c.print("Size of your pizza (in inches): ");
        size = c.readDouble();
        
        c.print("Number of toppings: ");
        top = c.readDouble();
        
        total = labor + util + ((base * 2) * size) + (top * topprice);
        
        c.print("\nYour total is : " + total);
    }
    
}
