import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.Color;
import java.util.Random;
import java.awt.Graphics2D;

/**
 * A retangular shape that can be positioned anywhere on the screen. 
 * Allen Lin  
 * 10/17/14
 */
 
public class Building
{
    /** int specify the starting pt of x */
    private int xLeft;
    
    /** int specify the top value */ 
    private int yMin;
    
    /** int specify the height of the frame*/
    private int frameHeight;
    
    /** int specify the width of the building*/
    private int bWidth;
   
    /**
     * Constructor for the class
     * @param frameHeight the height of the frame
     * @param bWidth the width of the building
     * @param xLeft staring x coordinate
     * @param yTop staring pt for y
     */
    public Building (int xLeft, int yMin, int width, int height)
    {
        this.frameHeight= height;
        this.bWidth= width;
        this.xLeft=xLeft;
        this.yMin=yMin;
    }
    
    public void draw (Graphics2D g2)
    {
        Rectangle building = new Rectangle(this.xLeft,this.yMin,this.bWidth,this.frameHeight);
        g2.setColor(Color.BLUE);
        g2.draw(building);
        g2.fill(building);
    }
       
   

   
}
