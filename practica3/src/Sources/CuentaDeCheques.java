package Sources;

public class CuentaDeCheques extends Cuenta
{
    private double montoSobregiro;

    
    public CuentaDeCheques(double montoSobregiro, double saldo) 
    {
        super(saldo);
        this.montoSobregiro = montoSobregiro;
    }
    
    public CuentaDeCheques(double saldo)
    {
        super(saldo);
        this.montoSobregiro = 1000;
    }
    
    @Override
    public void retirar(double monto)
    {
        if(monto <= saldo+montoSobregiro)
        {
            if(monto > saldo)
            {
                saldo = saldo + montoSobregiro;
                saldo = saldo - monto;
            }
            saldo = saldo-monto;
        }
        System.out.println("No se tienen los fondos suficientes");
    } 
}
