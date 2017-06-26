package prueba;
import fuentes.*;

public class PruebaFlotilla 
{
  public static void main(String[] args) 
  {
        Flotilla fl = new Flotilla("Castores");  
        System.out.println("Flota: "+fl);
        fl.setNombre("Ups");
        System.out.println("Nuevo nombre"+fl);
        
        //agregar un vehiculo
        Vehiculo v1 = new Vehiculo(10,"CDF",300);
        fl.agregarVehiculo(v1);
        System.out.println("Flota: "+fl);
        
  }
}
