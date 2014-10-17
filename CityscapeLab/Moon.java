import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Color;

/**
 * Write a description of class Moon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Moon
{
    private int xLeft; 
    private int yTop; 
    
    public Moon (int x, int y)
    {
        this.xLeft = x;
        this.yTop = y;
    }
    
    public void draw(Graphics2D g2)
    {
        Ellipse2D.Double moon = new Ellipse2D.Double(xLeft+20,yTop, 120,120);
        g2.setColor(Color.YELLOW);
        g2.fillOval(this.xLeft+20,this.yTop,120,120);
        g2.draw (moon);
    }
}

   
