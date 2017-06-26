/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primitivo;

/**
 *
 * @author JCVELMON
 */
public class Primitivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        /*byte b1= 077;// numero en octal
        byte b2 =0x77; //numero en hexadecimal
        System.out.println("bi= "+b1);
        System.out.println("b2= "+b2);*/
        
        /*int bitmask=0x000F;
        int val = 0x2222;
        System.out.println(val ^ bitmask);*/
        
        int a =100;
        int b=3;
        //Duplica el 100 3 veces 
        System.out.println(a<<b);
        //Divide al 100 3 veces 
        System.out.println(a>>b);
        
        int c=-1;
        int d = 30;
        System.out.println(c>>>d); //recorre todos lo bits e inserta 30 lugares
        
        int x = 1000;
        int res = -x;
        System.out.println("res "+res);
        
        boolean b1 = true;
        boolean b2 = false;
        
        boolean res2 = (b1 == b2) && (b2 = true);
        System.out.println("res2 "+res2);
        System.out.println("b1 "+b1);
        System.out.println("b2 "+b2);
        
        //Operador ternario
        int ter = 5;
        int ter2 = 10;
        int rester;
        rester = (ter==ter2) ?  ter : ter2;
        System.out.println("rester "+rester);
        
        
    }
    
}
