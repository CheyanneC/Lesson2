import TurtleGraphics.*;
import hsa.*;

public class MakeLine 
{
    public static void main(String[] args) 
    {
        Console c = new Console();
        
        int sx, sy, ex, ey; //'startx', 'endx', etc.
        
        c.print("Start point x: "); //ask user for x and y for both start and end
        sx = c.readInt();
        c.print("Start point y: ");
        sy = c.readInt();
        c.print("End point x: ");
        ex = c.readInt();
        c.print("End point y: ");
        ey = c.readInt();
        
        SketchPadWindow win = new SketchPadWindow(400, 400);
        StandardPen p = new StandardPen(win);
        
        p.up();
        p.move(sx - 200, sy - 200); //move to starting spot
        p.down();
        p.drawString("(" + sx + ", " + sy + ")"); //write the positon
        p.move(ex - 200, ey - 200); //move to end point
        p.drawString("(" + ex + ", " + ey + ")"); //write the position
    }
}
