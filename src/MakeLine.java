import TurtleGraphics.*;
import hsa.*;

public class MakeLine 
{
    public static void main(String[] args) 
    {
        Console c = new Console();
        
        int sx, sy, ex, ey;
        
        c.print("Start point x: ");
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
        p.move(sx - 200, sy - 200);
        p.down();
        p.drawString("(" + sx + ", " + sy + ")");
        p.move(ex - 200, ey - 200);
        p.drawString("(" + ex + ", " + ey + ")");
    }
}
