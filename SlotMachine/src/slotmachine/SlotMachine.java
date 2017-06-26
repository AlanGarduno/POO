package slotmachine;

import java.util.Random;
import java.util.Scanner;

public class SlotMachine 
{
    double dollars;
    int coins;
    int coinsA;
    enum figuras{BELL,GRAPE,CHERRY};
    figuras slots[];
    
    
    public SlotMachine()
    {
        slots = new figuras[3];
    }
    
    public void generarCombinacion()
    {
        int r;
        for(int i = 0; i<3;i++)
        {
            r =Math.abs(new Random().nextInt()%3);
            if(r == 0)
            {
               slots[i] = figuras.BELL;
               System.out.println("["+"BELL"+"]");
            }
            if(r == 1)
            {
                slots[i] = figuras.GRAPE;
                System.out.println("["+"GRAPE"+"]");
            }
            if(r == 2)
            {
               slots[i] = figuras.CHERRY;
               System.out.println("["+"CHERRY"+"]");
            }
        }
    }
    
    public boolean win()
    {
        
        if(slots[0] == figuras.BELL && slots[1] == figuras.BELL && slots[2] == figuras.BELL)
        {
            this.coins = coins *10;
            return true;
        }
        else if(slots[0] == figuras.GRAPE && slots[1] == figuras.GRAPE && slots[2] == figuras.GRAPE)
        {
            this.coins = coins *7;
            return true;
        }
        else if(slots[0] == figuras.CHERRY && slots[1] == figuras.CHERRY && slots[2] == figuras.CHERRY)
        {
            this.coins = coins *5;
            return true;
        }
        else if(slots[0] == figuras.CHERRY && slots[1] == figuras.CHERRY || slots[0] == figuras.CHERRY && slots[2] == figuras.CHERRY || slots[1] == figuras.CHERRY && slots[2] == figuras.CHERRY )
        {
          this.coins = coins *3;
          return true;
        }
        else if(slots[0] == figuras.CHERRY || slots[1] == figuras.CHERRY || slots[2] == figuras.CHERRY)
        {
         this.coins = coins *1;
         return true; 
        }
        else 
        {
            this.coins = coins - coinsA;
            return false;
        }
    }
    
    public void play( )
    {
        
    }

}
