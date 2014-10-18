import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 * Class that creates instances of the classes that comprise the cityscape and delegates drawing the
 * cityscape to these object.
 * 
 * @author Allen Lin 
 * @version 18 Oct 2014
 */
 
public class CityscapeComponent extends JComponent
{
    /**
     * This component draws one car, one moon, and three retangular building shapes at given x,y coordinates.  
     * @param g the graphics context
     * @return nothing.
     */
     
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
    /** instancevar x the x-coordinate of the front of the car
     *  instancevar y the y-coordinate of the front of the car
     */

        int x = 15;
        int y = getHeight() -38;
        
        Car car1 = new Car(x,y);
        car1.draw(g2);
        

        Moon moon1 = new Moon (0,0);
        moon1.draw(g2);
        
    /** instancevar a the initial x-coordinate of the first retangular building. */
     
        int a = 200;
        int b = getHeight();
                
        Building building1 = new Building(a,100,100,600);
        Building building2 = new Building(a+200,200,100,500);
        Building building3 = new Building(a+400,240,100,460);
        building1.draw(g2);
        building2.draw(g2);
        building3.draw(g2);
        
    }
        
        
}
