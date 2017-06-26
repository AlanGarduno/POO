package fuentes;

public class Radio extends Object 
{
    private int volumen;
    private String frecuencia;
    private String estacion;
    private boolean prendido;
    private String [] estacionesAM;
    private String [] estacionesFM;
    private int indiceAM;
    private int indiceFM;

    public Radio()
    {
        this.volumen = 20;
        this.frecuencia = "AM";
        this.prendido = true;
        this.estacionesAM = new String[]{"700 etadio w","1000 radio mil"};
        this.estacionesFM = new String[]{"91.3 alfa","99.3 disney"};
        this.indiceAM = 0;
        this.indiceFM = 0;
        this.estacion = estacionesAM[indiceAM];
    }
    

    @Override
    public String toString( ) 
    {
        String temp = "Radio{" + "volumen=" + volumen + 
                ", frecuencia=" + frecuencia +
                ", estacion=" + estacion+
                ", prendido=" + prendido +'}'+"\n";
        for (int i = 0; i < estacionesAM.length; i++) {
            temp += " "+estacionesAM[i]+" ";
            
        }
                
        for (int i = 0; i < estacionesFM.length; i++) {
            temp +=" "+estacionesFM[i]+" ";
            
        }
        return temp;
    }
    
    public void subirVolumen( )
    {
        if(this.volumen > 100)
        {
            System.out.println("El valumen sobrepasa el limite");
        }
        else
        {
            this.volumen++;
        }
    }
    
    public void bajarVolumen( )
    {
        if(this.volumen > 0)
        {
            this.volumen--;
        }
        else
        {
            System.out.println("El Volumen esta en lo minimo");
        }
           
    }
    
    public void cambiarFrecuencia( )
    {
        if(this.frecuencia.equals("AM"))
        {
            this.frecuencia = "FM";
          
        }
        else
        {
            this.frecuencia = "AM";
        }
    }
    
    public void subirEstacion( )
    {
        if(frecuencia.compareTo("FM") == 0)
        {
            if(indiceFM < estacionesFM.length-1)
             {
                 estacion = estacionesFM[++indiceFM];
             }
            else
            {
                indiceFM=0;
                estacion = estacionesFM[indiceFM];
            }
        }
        else
        {
             if(indiceAM < estacionesAM.length-1)
             {
                 estacion = estacionesAM[++indiceAM];
             }
            else
            {
                indiceAM=0;
                estacion = estacionesAM[indiceAM];
            }
        }
    }
    
    public void bajarEstacion( )
    {
        if(frecuencia.compareTo("FM") == 0)
        {
            if(indiceFM == estacionesFM.length)
             {
                 estacion = estacionesFM[--indiceFM];
             }
            else
            {
                indiceFM=1;
                estacion = estacionesFM[indiceFM];
            }
        }
        else
        {
             if(indiceAM == estacionesAM.length)
             {
                 estacion = estacionesAM[--indiceAM];
             }
            else
            {
                indiceAM=1;
                estacion = estacionesFM[indiceAM];
            }
        }
    }
    
    public void prender( )
    {
        if(prendido == false)
        {
            prendido = true;
        }
    }
    
    public void apagar( )
    {
        if(prendido == true)
        {
            prendido = false;
        }
    }
    
    
}
