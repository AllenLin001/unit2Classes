

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Write a description of test class CarTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CarTest
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;

    /**
     * Default constructor for objects of class CarTest
     */
    public CarTest()
    {
        // initialise instance variables
        x = 0;
    }
    
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    @Test 
    public void testGetGasInTank()
    {
        Car testcar = new Car(50);
        double gallons = testCar.getGasInTank();
        assertEquals(0.0, gallons,1e-6);
    }
    @Test 
    public void testAddGas();
    testCar.addGas(20);
    double gallons = testCar.getCarInTank();
    assertEquals(25.0, gallons, 1e-6);
}
