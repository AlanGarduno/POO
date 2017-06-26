/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sources;

/**
 *
 * @author JCVELMON
 */
public class Problemas 
{
    private int numberOne;
    private int numberTwo;
    private int problema;

    public Problemas() 
    {
        this.numberOne = (int)(Math.random() * 10) +1;
        this.numberTwo = (int)(Math.random() * 10) +1;
        this.problema = (int)(Math.random() * 4) +1;
    }
    
    public int suma()
    {
     int res = 0;
     res = numberOne + numberTwo;
     return res;
    }
    
    public int resta()
    {
     int res = 0;
     res = numberOne - numberTwo;
     return res;   
    }
    
    public int multi()
    {
     int res = 0;
     res = numberOne * numberTwo;
     return res;
    }
    
    public int div()
    {
     int res = 0;
     res = numberOne / numberTwo;
     return res;
    }
    
    public String generarPoblema()
    {
        switch(problema)
        {
            case 1:
                return (Integer.toString(numberOne)+'+'+Integer.toString(numberTwo));
            case 2:
                 return (Integer.toString(numberOne)+'-'+Integer.toString(numberTwo));
            case 3:
                 return (Integer.toString(numberOne)+'*'+Integer.toString(numberTwo));
            case 4:
                 return (Integer.toString(numberOne)+'/'+Integer.toString(numberTwo));
        }
       
        return null;
    }
    
    public int solucionarProblema()
    {
        switch(problema)
        {
            case 1:
                return suma();
            case 2:
                 return resta();
            case 3:
                 return multi();
            case 4:
                 return div();
        }
       
        return 0;
        
    }
}
