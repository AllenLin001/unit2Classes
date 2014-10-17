import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 * Class that creates instances of the classes that comprise the cityscape and delegates drawing the
 *  cityscape to these object.
 * 
 * @author @gcschmit
 * @version 18 July 2014
 */
public class CityscapeComponent extends JComponent
{
    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
       
        int x = 15;
        int y = getHeight() -38;
        
        Car car1 = new Car(x,y);
        car1.draw(g2);
        

        Moon moon1 = new Moon (0,0);
        moon1.draw(g2);
        
    
        int a = 200;
        int b = getHeight();
                
        Building building1 = new Building(a,100,100,600);
        Building building2 = new Building(a+200,200,100,500);
        Building building3 = new Building(a+400,240,100,460);
        building1.draw(g2);
        building2.draw(g2);
        building3.draw(g2);
        
    }
   
     
       
        // create instances of classes and invoke the draw method on each
        // ...
        
        


}
