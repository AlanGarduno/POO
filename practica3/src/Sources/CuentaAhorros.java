package Sources;

public class CuentaAhorros extends Cuenta
{
    private double tasaDeInteres;

    public CuentaAhorros(double tasaDeInteres,double saldo) 
    {
        super(saldo);
        this.tasaDeInteres = tasaDeInteres;
    }
    
    
    @Override
    public double consultar()
    {
        saldo+=saldo*tasaDeInteres/100;
        return saldo;
    }
    
    
}
