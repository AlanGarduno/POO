import javax.swing.JOptionPane;

public class EntradaSalidaDatos 
{
    public static void main(String[] args) 
    {
        String nombre;
        nombre = JOptionPane.showInputDialog("Ingresa Tu nombre");
            JOptionPane.showMessageDialog(null, "Hola "+nombre);
            
         //Leer una cadena y mostrar sus primeros 4 caracteres
         
         String cadena,subcadena;
         
         cadena = JOptionPane.showInputDialog("Ingresa una cadena");
         if( cadena.length() >= 4)
         {
             subcadena = cadena.substring(0, 4);
             JOptionPane.showMessageDialog(null,subcadena);
         }
         else
             JOptionPane.showMessageDialog(null,cadena);
         
         //Converiti de entero a string 
         String edad;
         edad = JOptionPane.showInputDialog("Dame tu edad");
         int e = Integer.parseInt(edad); //Convertir un string a entero
         JOptionPane.showMessageDialog(null,"Edad en un año: "+(++e));
         
         //Leer la base y la altura de un triangulo, calcular su area y mostrarla
         
         String base,altura;
         double a,b,area;
         base = JOptionPane.showInputDialog("Dame una base");
         altura = JOptionPane.showInputDialog("Dame una base");
         b=Double.parseDouble(base);
         a=Double.parseDouble(altura);
         area = ((a*b)/2);
         JOptionPane.showMessageDialog(null,"El area del tringulo es: "+area);
         
         //Calcular indice de masa muscular
         String estatura,peso;
         int d,p;
         double im;
         estatura = JOptionPane.showInputDialog("Dame tu estatura");
         peso = JOptionPane.showInputDialog("Dame tu peso");
         d= Integer.parseInt(estatura);
         p = Integer.parseInt(peso);
         im = (p)/Math.pow(e, 2);
         JOptionPane.showMessageDialog(null, im);
         
         
    }
}
