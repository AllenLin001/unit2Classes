import java.awt.Graphics; 
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 * Write a description of class TargetComponents here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TargetComponents
{
    public void paintComponent(Graphics g)
    {
        Graphics2D g2= (Graphics2D ) g;
        
        Circle target1 = new Circle (0,0);
        
        int x = getWidth()- 60;
        int y=getHeight() - 30;
        
        Target target1= new Target(x,y);
        
        target1.draw(g2);
        target2.draw(g2);
    }   
}

    
