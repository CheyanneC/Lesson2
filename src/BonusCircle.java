import TurtleGraphics.*;

public class BonusCircle 
{
    public static void main(String[] args) 
    {
        SketchPadWindow win = new SketchPadWindow(600, 600);
        RainbowPen r = new RainbowPen(win);
        
        r.up();
        r.move(0, 100); //move to starting position
        r.down();
        
        for(int x = 0; x < 100; x ++) //create circle
        {
            r.turn(3.6); //always rotate 3.6 to form the circle
            r.move(8); //move 8 each time
        }
    }
    
}
