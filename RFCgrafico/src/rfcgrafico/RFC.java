/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rfcgrafico;

/**
 *
 * @author alumno
 */
public class RFC 
{
    private String nombre;
    private String Ap;
    private String Am;
    private String fechaNacimiento;

    public RFC() {
    }
    
    public String generar(String nombre, String Ap, String Am, String fechaNacimiento)
    {
        String aux ="@";
        aux = Ap.substring(0,1) + primeraVocal(Ap) + Am.substring(0,1) + nombre.substring(0, 1) + fechaNacimiento.substring(2,4) + fechaNacimiento.substring(5,7) + fechaNacimiento.substring(8,10);
        return aux;
    }
    
    private char primeraVocal(String Ap)
    {
        int i =0;
        char v=0;
        while(Ap.length() > i)
        {
            if(Ap.charAt(i) == 'A' || Ap.charAt(i) == 'E'|| Ap.charAt(i) == 'I' || Ap.charAt(i) == 'O' || Ap.charAt(i) == 'U')
            {
                 v = Ap.charAt(i);
                return v;
            }
            i++;
        }
        
        return v;
    }
    
    
}
