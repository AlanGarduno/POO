package Pruebas;
import Fuentes.Invoice;

public class PruebaInvoce 
{
    public static void main(String[] args)
    {
        Invoice i = new Invoice("00389A","ESCOM INVOCE",300,289.80);
        System.out.println(i);
        System.out.println(" "+i.getPaymentAmount());
        
    }
    
}
