package Fuentes;

public interface Payable 
{
    default public double getPaymentAmount()
    {
        return 0;
    }
    
}
