package fuentes;

public class Flotilla 
{
    private Vehiculo [] vehiculos;
    private String nombre;
    private int indice;

    public Flotilla(String nombre )
    {
       vehiculos = new Vehiculo[4];
       this.nombre = nombre;
       this.indice = -1;
    }

    @Override
    public String toString()
    {
        String tmp = "Flotilla{" + "nombre=" + nombre + '}';
        for (int i = 0; i <= indice ; i++)
        {
            tmp += "\n"+this.vehiculos[i].toString();
            
        }
        
        return tmp;
    }

    public String getNombre() 
    {    
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
      
    public void agregarVehiculo(Vehiculo v)
    {
        if(this.indice < this.vehiculos.length -1)
        {
            this.vehiculos[++indice]=v;
        }
        else
        {
            System.out.println("Flota Llena");
        }
    }
        
}

