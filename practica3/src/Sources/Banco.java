package Sources;

public class Banco 
{
    private Cliente[] clientes;
    private int numClientes;

    public Banco() 
    {
        clientes = new Cliente[5];
        numClientes = -1;
    }
    
    public void agregaCliente(String nom,String numCta)
    {
        Cliente cliente = new Cliente(nom);
        Cuenta cuenta  = new Cuenta(50000);
        cliente.establecerCuenta(cuenta);
        if(numClientes <clientes.length-1)
        {
            clientes[++numClientes] = cliente;
        }
    }
    
    public int obtenerNumClientes()
    {
        return this.numClientes;
    }
    
    public Cliente obtenerClinete(int indice)
    {
        if(indice >= 0 && indice < clientes.length)
        {
            return clientes[indice];
        }
        return null;
    }
    
    public void imprimirClientes()
    {
        for (int i = 0; i < numClientes; i++) 
        {
            System.out.println("Nombre: "+clientes[i].obtenerNombre() 
                    +"Cuenta: "+clientes[i].obtenerNumCuenta()
                    +"Saldo: "+clientes[i].obtenerCuneta().consultar());   
        }
    }
    
    
    
}
