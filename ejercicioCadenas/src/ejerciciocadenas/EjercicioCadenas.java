
package ejerciciocadenas;

public class EjercicioCadenas {

    public static void main(String[] args) 
    {
       String cad1="fantastico";
       int m = cad1.length()/2;
       char c = cad1.charAt(m);
        System.out.println("c="+c);
        
        
        int cont=0;
        String cad2="amigo";
        for (int i = 0; i < cad2.length(); i++) 
        {
            if(cad2.charAt(i) == 'a' || cad2.charAt(i) == 'e' || cad2.charAt(i) == 'i'|| cad2.charAt(i) == 'o' || cad2.charAt(i) == 'u')
            {
              cont=cont+1;  
            }  
        }
        
        System.out.println("El numero de vocales es="+cont);
        
        
        String cad3 = "perreo";
        
    }
    
}
