
package source;

public class Bear extends Animal
{

    public Bear()
    {
        System.out.println("Bear constructor");
    }

    @Override
    public String toString() 
    {
        return super.toString() + "Im a Bear" + "weight= "+weight;
    }
    
    
    
    
}
