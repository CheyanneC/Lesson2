import TurtleGraphics.*;
import hsa.*;
import java.awt.Color;

public class BarGraph 
{
    public static void main(String[] args) 
    {
        Console c = new Console();
        
        int num1, num2, num3, num4; //variable to recieve info
        
        //I added loops before you said not to 
        //so here you go :)
        
        while(true) //get user to enter number
        {
            c.print("Enter 1st number between 1 and 200: "); 
            num1 = c.readInt(); //if the number is not between 1 and 200 repeat
            
            if(num1 >= 1 && num1 <= 200) break; //break when criteria is met
        }
        
        while(true) //repeat with the 3 other numbers
        {
            c.print("Enter 2nd number between 1 and 200: ");
            num2 = c.readInt();
            
            if(num2 >= 1 && num2 <= 200) break;
        }
        
        while(true) 
        {
            c.print("Enter 3rd number between 1 and 200: ");
            num3 = c.readInt();
            
            if(num3 >= 1 && num3 <= 200) break;
        }
        
        while(true) 
        {
            c.print("Enter 4th number between 1 and 200: ");
            num4 = c.readInt();
            
            if(num4 >= 1 && num4 <= 200) break;
        }
        
        SketchPadWindow win = new SketchPadWindow(600, 400);
        StandardPen p = new StandardPen(win);
        
        int sety = -130;
        
        p.setWidth(40); //set thickness to have a full bar
        p.setColor(Color.BLUE); //set color for first bar
        p.up(); 
        p.move(-250, sety); //move to starting position
        p.down();
        p.move(-250, sety + num1); //move up by the amount stated by user 
        p.move(-210, sety + num1); //make the bar have a width of 40
        p.move(-210, sety); //go back down to the orignal starting point
        p.up(); //move up 
        p.move(-245, sety + num1 + 30); //go to positon to write text
        p.down();
        p.drawString("" + num1); //right num1 value
        
        p.setColor(Color.MAGENTA); //repeat
        p.up();
        p.move(-125, sety); //move bar over 85
        p.down();
        p.move(-125, sety + num2);
        p.move(-85, sety + num2);
        p.move(-85, sety);
        p.up();
        p.move(-120, sety + num1 + 30);
        p.down();
        p.drawString("" + num1);
        
        p.setColor(Color.RED);
        p.up();
        p.move(0, sety);
        p.down();
        p.move(0, sety + num3);
        p.move(40, sety + num3);
        p.move(40, sety);
        p.up();
        p.move(5, sety + num1 + 30);
        p.down();
        p.drawString("" + num1);
        
        p.setColor(Color.GREEN);
        p.up();
        p.move(125, sety);
        p.down();
        p.move(125, sety + num4);
        p.move(165, sety + num4);
        p.move(165, sety);
        p.up();
        p.move(130, sety + num1 + 30);
        p.down();
        p.drawString("" + num1);
        
        p.setWidth(2);
        p.setColor(Color.BLACK); //draw line on the bottom of all the bars 
        p.up();
        p.move(-270, -150);
        p.down();
        p.move(185, -150);
    }
}
