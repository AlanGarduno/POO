package coffe;

public class Order 
{   
    private int bags;
    private int largeBoxes;
    private int mediumBoxes;
    private int smallBoxes;
    private static final double  LARGE_BOX_COST = 2.0;
    private static final double  MEDIUM_BOX_COST = 1.0;
    private static final double  SMALL_BOX_COST = 0.5;
    private static final int LARGE_BOX_CAPACITY = 20;
    private static final int MEDIUM_BOX_CAPACITY = 10;
    private static final int SMALL_BOX_CAPACITY = 5;
    private static final double BAGS_COST = 5.50;
    private double costo;
    
    
    public Order(int bags)
    {
        this.bags = bags;
        this.largeBoxes = 0;
        this.mediumBoxes = 0;
        this.smallBoxes = 0;
    }

    @Override
    public String toString() 
    {
        return "Order{" + "Number of Bagss Ordered=" + bags +"-$" +", largeBoxes=" + largeBoxes + ", mediumBoxes=" + mediumBoxes + ", smallBoxes=" + smallBoxes + '}';
    }
    
    public void getBoxes()
    {
        largeBoxes = bags/LARGE_BOX_CAPACITY;
        if(bags % LARGE_BOX_CAPACITY > 15)
        {
            largeBoxes++;
        }
        else
        {
            mediumBoxes = (largeBoxes%20)/10;
            smallBoxes = bags%5;
        }

    }
    
    public double largeBoxesCost()
    {
        return largeBoxes*LARGE_BOX_COST;
    }
    
    public double mediumBoxesCost()
    {
        return mediumBoxes*MEDIUM_BOX_COST;
    }
    
    public double smallBoxesCost()
    {
        return smallBoxes*SMALL_BOX_COST;
    }
    
    public double bagsCost()
    {
        return bags * BAGS_COST;
    }
    
    public void totalCost()
    {
        this.costo = largeBoxesCost() + mediumBoxesCost() + smallBoxesCost() + bagsCost();
    }
        
}
