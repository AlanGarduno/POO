package body;

public class cuerpo 
{
 private double imc;
 private double peso;
 private String nombre;
 private double altura;
 
 public cuerpo()
 {
     this.imc = this.altura/Math.pow(this.peso,2);
     this.nombre="Alan";
     this.peso = 58;
     this.altura = 1.77;
 }
 
public void imprimir()
{
    System.out.println("nombre="+nombre+" imc="+imc);
}

void cambiarPeso(double nuevoPeso)
{
    this.peso = nuevoPeso;
}
 

 
}
