package pruebas;
import fuentes.*;

public class Prueba 
{   
    public static void main(String[] args)
    {
      Radio radio1;  
      radio1 = new Radio();
      radio1.subirVolumen();
    System.out.println("radio1="+radio1.toString());
    radio1.subirEstacion();
   System.out.println("radio1="+radio1.toString());
   radio1.subirEstacion();
   System.out.println("radio1="+radio1.toString());
    }
}
