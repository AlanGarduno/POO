
package Fuentes;

public abstract class Animal 
{
    protected int legs;

    protected Animal(int legs)
    {
        this.legs = legs;
    }
    
    public  void walk()
    {
        System.out.println("I'm walking on my" +legs+ "legs");
    }
    public abstract void eat();
}
