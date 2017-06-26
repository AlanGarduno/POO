
package repaso;


public class Repaso 
{

    public static void main(String[] args) 
    {
       String s= "Just another striong";
       String s2 = "Any other literal";
       s = s2;
        System.out.println("s ="+s);
        s2=s2.toUpperCase().replace('A', '#');
        System.out.println("s2="+s2);
        
        s2 = s2.toLowerCase().replace(' ', '@');
        System.out.println("s2="+s2);
        
        s2 = s2.substring((s2.length())/2);
        System.out.println("s2="+s2);
        System.out.println(""+"Sismo de 1085".substring(6));
    }
    
}
   
