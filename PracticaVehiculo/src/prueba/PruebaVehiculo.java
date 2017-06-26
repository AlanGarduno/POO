package prueba;
import fuentes.*;

public class PruebaVehiculo 
{
    
    public static void main(String[] args) 
    {
        Vehiculo miVehiculo = new  Vehiculo(10,"ABC",100); 
        miVehiculo.cargarPeso(70);
        miVehiculo.descargarPeso(50);
    }
    
}
