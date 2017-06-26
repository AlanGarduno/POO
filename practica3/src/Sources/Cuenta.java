package Sources;


public class Cuenta 
{
    protected double saldo;

    public Cuenta(double saldo) 
    {
        this.saldo = saldo;
    }
    
    public double consultar()
    {
        return saldo;
    }
    
    public void depositar(double monto)
    {
        if(monto > 0)
        {
            this.saldo = this.saldo + monto;
        }
        System.out.println("El monto es incorrecto");
        
    }
    
    public void retirar(double monto)
    {
        if(monto < this.saldo)
        {
            this.saldo = this.saldo - monto;
        }
        System.out.println("Saldo insuficiente");
            
    }
    
    
}
