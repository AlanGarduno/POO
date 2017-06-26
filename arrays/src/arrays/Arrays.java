package arrays;

public class Arrays {

    public static void main(String[] args)
    {
       //int numeros[10]; Inorrecto
        
        int numeros[];
        String [] cadenas;
        byte [] matriz[];
        boolean banderas[] = {false,true,false};
        double calificaciones [] = new double[50];
        
        for (int i = 0; i < calificaciones.length; i++) 
        {
            System.out.println(""+calificaciones[i]);
            
        }
        
        //Ejercicio 1: LLenar con caracteres aleatorios un arreglo de tamaño 40, mostrarlo en pantalla
        
        char [] caracteres = new char[40];
        
        for (int i = 0; i < caracteres.length; i++)
        {
            char c =(char)(int)(Math.random()*100);
            caracteres[i] = c ;
        }
        for (int i = 0; i < caracteres.length; i++) {
            System.out.print(""+caracteres[i]);
            
        }
    }
    
}
