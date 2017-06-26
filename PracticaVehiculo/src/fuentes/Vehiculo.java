package fuentes;

public class Vehiculo 
{
    private int carga;
    private String id;
    private int capacidad;

    
    public Vehiculo(int carga, String id, int capacidad) 
    {
        if(carga > capacidad)
        {
            this.carga = capacidad;
            this.id = id;
            this.capacidad = capacidad;  
        }
        else
        {
            this.carga = carga;
            this.id = id;
            this.capacidad = capacidad;   
        }
    }
    
    @Override
    public String toString() 
    {
        return "Vehiculo{" + "carga=" + carga + ", id=" + id + ", capacidad=" + capacidad + '}';
    }
    
    public void cargarPeso(int peso)
    {
        if(carga + peso <= capacidad)
        {
            carga = carga + peso;
        }
        System.out.println(""+this);
    }
    
    public void descargarPeso(int peso)
    {
        if(carga >= peso)
        {
            carga = carga - peso;
        }
        System.out.println(""+this);
    }
    
}
