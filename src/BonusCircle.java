import TurtleGraphics.*;

public class BonusCircle 
{
    public static void main(String[] args) 
    {
        SketchPadWindow win = new SketchPadWindow(600, 600);
        RainbowPen r = new RainbowPen(win);
        
        r.up();
        r.move(0, 100);
        r.down();
        
        for(int x = 0; x < 100; x ++)
        {
            r.turn(3.6);
            r.move(8);
        }
    }
    
}
