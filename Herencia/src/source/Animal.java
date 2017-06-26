
package source;


public class Animal 
{
    protected double weight;
    protected double height;
    String color;
    private String name;
    

    public Animal() 
    {
        System.out.println("Animal constructor");
    }

    @Override
    public String toString()
    {
        return "Im an Animal"+"weight= "+weight;
    }
    
    
    
    
}
