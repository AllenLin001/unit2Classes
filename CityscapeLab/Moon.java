import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Color;

/**
 * a circle shape Moon that can be displaced anywhere on the screen at ()
 * Allen Lin  
 * 10/18/14 
 */

public class Moon
{
    /**
      instancevar xLeft the x-coordinate of the center of the moon on the screen. 
      instancevar yTop the y-coordinate of the center of the moon on the screen. 
    */
    
    private int xLeft; 
    private int yTop;
    
    /**
       Constrcuts a moon with a given center.
       param@ x the x coordinate of center of the moon. 
       param@ y the y coordinate of the moon.   
    */
    
    public Moon (int x, int y)
    {
        this.xLeft = x;
        this.yTop = y;
    }
    
    /**
       Draws the moon.
       @param g2 the graphics context. 
    */

    public void draw(Graphics2D g2)
    {
        Ellipse2D.Double moon = new Ellipse2D.Double(xLeft+20,yTop, 120,120);
        g2.setColor(Color.YELLOW);
        g2.fillOval(this.xLeft+20,this.yTop,120,120);
        g2.draw (moon);
        
    }
}

   
