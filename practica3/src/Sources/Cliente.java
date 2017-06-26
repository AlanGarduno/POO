package Sources;

import java.util.Random;

public class Cliente 
{
    private String nombre;
    private Cuenta cuenta;
    private String numCuenta;

    public Cliente(String nombre)
    {
        this.nombre = nombre;
        cuenta = null;
        numCuenta =""+Math.abs(new Random().nextInt());
    }
    
    public String obtenerNombre()
    {
        return this.nombre;
    }
    
    public Cuenta obtenerCuneta()
    {
        return this.cuenta;
    }
    
    public void establecerCuenta(Cuenta cuenta)
    {
        this.cuenta = cuenta;
       
    }
    
    public String obtenerNumCuenta()
    {
        return this.numCuenta;
    }
    
}
