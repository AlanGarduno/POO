/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matefunciones;

/**
 *
 * @author AGV
 */
public class MateFunciones {

    public static void main(String[] args) 
    {
        double res = Math.E; //Constante de numero E
        double exp1 = Math.exp(4); // Eleva el numero e a la 4
        double res2 = Math.log(exp1);//La operacion inversa de exp
        double pot = Math.pow(10,3);// Eleva 10 a la 3
        double res3 = Math.log10(pot); // operacion inversa de pow 
        System.out.println("E= "+res3);
        
        double res4 = Math.abs(-0621); //abs es un metodo sobrecargado qu deviuilve el valor absoluto
        System.out.println("res4 = "+res4);
        
        double a = Math.ceil(10.24); //Redondea hacia arriba
        double b = Math.floor(10.24); // redondea hacia abajo
        double c = Math.round(14.8); //Redondeo normal  14.6 sube a 15 y 14.3 baja a 14
        System.out.println("Arriba= "+a);
        System.out.println("Abajo= "+b);
        System.out.println("Round="+c);
        
        //Funciones trigonometricas
        
        double res5 = Math.sin(Math.PI/2); //Seno en radianes 
        double rad = Math.toRadians(60); // Convierte de grados a radianes                      
        System.out.println("Sin= "+res5);
        
        //Numeros aleatorios 
        for (int i = 0; i < 10; i++) 
        {
            double res6 = Math.random()* 1000; // random da numeros del o-1 pero si se desea aumentar el rango se multiplica por un entero 
            System.out.println("Numero aleatorio= "+res6);
        }
        
        int res7 = Math.addExact(6, 7);
        System.out.println("res=" +res7);
        
        //Sume dos numeros aleatorios entr o y 1 y el resultado redondear hacia abajo
        
        double n1 = Math.random();
        double n2 = Math.random();
        double suma = n1 + n2;
        double res9 = Math.floor(suma);
        System.out.println("Suma redondeada= "+res9);
        
        //Dado 2 numeros aleatorios, elevar el mayor de ellos al 5 potencia
        
        double n3 = Math.random();
        double n4 = Math.random();
        double mayor = Math.max(n3, n4);
        System.out.println("Resultado= "+Math.pow(mayor,5));
        
        //Econtrar el valor de x
        
        double y = Math.pow(Math.random(),6);
        double e = Math.pow(Math.E,3);
        double x = Math.pow((y-e),1/5);
        System.out.println("Resultado= "+x);
                
    }
    
}
