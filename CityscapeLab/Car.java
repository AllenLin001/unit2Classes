import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;

/**
 * A car shape that can be positioned anywhere on the screen.
 * Allen Lin 
 * 10/17/14
 */
 
public class Car
{
    /** 
     * instancevar xLeft the x - coordinate of the top left conner.
     * instancevar Xtop the y coorinate of the tope left conner. 
    */
    
    private int xLeft;
    private int yTop;
    
    /** 
     * Constructs a car with given top left corner coordinates.
     * @param x the x-coordinate of the top-left corner
     * @param y the y-coordinate of the top left corner
    */
    
    public Car(int x, int y)
    {
        xLeft = x;
        yTop = y;
    }
    /** 
     * Draws the car.
     * @param g2 the graphics context 
    */ 
    public void draw(Graphics2D g2)
    {
        Rectangle body = new Rectangle (xLeft, yTop+10, 120,20);
        Ellipse2D.Double frontTire = new Ellipse2D.Double(xLeft+10,yTop+20,20,20);
        Ellipse2D.Double rearTire= new Ellipse2D.Double (xLeft+75,yTop+20,20,20);
        
        Point2D.Double r1 = new Point2D.Double(xLeft+40, yTop+10);
        Point2D.Double r2 = new Point2D.Double (xLeft+60, yTop);
        Point2D.Double r3 = new Point2D.Double (xLeft+80, yTop);
        Point2D.Double r4 = new Point2D.Double (xLeft+100, yTop+10);
        
        Line2D.Double frontWindshield = new Line2D.Double (r1,r2);
        Line2D.Double roofTop = new Line2D.Double(r2,r3);
        Line2D.Double rearWindshield = new Line2D.Double (r3,r4);
        
        Point2D.Double r5 = new Point2D.Double(xLeft+140, yTop+10);
        Point2D.Double r6 = new Point2D.Double(xLeft+170, yTop+10);
        Point2D.Double r7 = new Point2D.Double(xLeft+140, yTop+15);
        Point2D.Double r8 = new Point2D.Double(xLeft+170, yTop+15);
        Point2D.Double r9 = new Point2D.Double(xLeft+140, yTop+20);
        Point2D.Double r10 = new Point2D.Double(xLeft+170, yTop+20);
        
        Line2D.Double dash1= new Line2D.Double(r5,r6);
        Line2D.Double dash2= new Line2D.Double(r7,r8);
        Line2D.Double dash3= new Line2D.Double(r9,r10);
       
        
        g2.draw (body);
        g2.draw(frontTire);
        g2.draw(rearTire);
        g2.draw(frontWindshield); 
        g2.draw(roofTop);
        g2.draw(rearWindshield);
        g2.draw(dash1);
        g2.draw(dash2);
        g2.draw(dash3);
        g2.setColor(Color.RED);
        g2.fill(body);
        g2.setColor(Color.BLACK);
        g2.fill(frontTire);
        g2.fill(rearTire);
        g2.setColor(Color.BLUE);
      
    }
}                
    
            
            
           
    



