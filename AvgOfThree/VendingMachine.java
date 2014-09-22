

/**
 * Write a description of class VendingMachine here.
 * 
 * @Allen Lin (your name) 
 * @9/18/2014 (a version number or a date)
 */
public class VendingMachine
{
    /** description of instance variable x (add comment for each instance variable) */
    private int vendingCans ;
    private int vendingTokens ; 

    /**
     * Default constructor for objects of class VendingMachine
     */
    public VendingMachine () 
    {
        this.vendingCans = 10;
    }
   
    public VendingMachine(int vendingCans)
    {
        this.vendingCans = vendingCans;
    }
    
    public void fillUp(int vendingCans)
    {
        this.vendingCans+= vendingCans ;
    }
    public void insertToken() 
    {
        this.vendingCans -=1; 
        this.vendingTokens +=1;
    }
    
    public int getvenCans()
    {
        return this.vendingCans; 
    }
    
    public int getTokens()
    {
        return this.vendingTokens; 
    }
    
    
}   
