package Pruebas;
import Fuentes.*;
import java.util.ArrayList;
public class TestBanking 
{
    public static void main(String[] args)
    {
        Account cuenta = new Account(1000);
        ArrayList <Account> cuentas = new ArrayList<>();
        cuentas.add(cuenta);
        cuentas.add(new Account(2000));
        for (int i = 0; i < cuentas.size(); i++) 
        {
            System.out.println("Balance cuenta: "+cuentas.get(i).getBalance());
            
        }
    }
    
}
