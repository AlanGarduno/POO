package Fuentes;

public class Account 
{
    private double  balance;
    
    public Account(double balance)
    {
        this.balance = balance;
    }

    public double getBalance() 
    {
        return balance;
    }
    
    public double deposit(double amt)
    {
        if(amt > 0)
        {
            return balance += amt;
        }
        
        return 0;
    }
    
    public double withdraw(double amt) //retirar
    {
        if(balance >= amt)
        {
            return balance -= amt;
        } else {
        }
        
        return 0;
    }
    
}
