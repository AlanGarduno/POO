package test;
import Sources.*;
import java.util.Scanner;
public class League 
{
    public static void main(String[] args) 
    {
        Team equipo = new Team();
        SoccerPlayer jugador;
        int opcion,edad,numero,loop;
        double peso,altura;
        String nombre,nacionalidad,posicion;
        Scanner s = new Scanner(System.in);
        do{
        System.out.println("Selecciona una opcion");
        System.out.println("1.Alta Jugador\n2.Baja Jugador\n3. Modificar Jugador");
        opcion = s.nextInt();
        switch(opcion)
        {
            case 1:
                System.out.println("Ingresa el nombre del jugador");
                nombre = s.next();
                System.out.println("Ingrese la edad del jugador");
                edad = s.nextInt();
                System.out.println("Ingresa el numero del jugador");
                numero = s.nextInt();
                System.out.println("Ingrese la posicion");
                posicion = s.next();
                System.out.println("Ingrese la nacionalidad");
                nacionalidad = s.next();
                System.out.println("Ingrese la altura");
                altura =  s.nextDouble();
                System.out.println("Ingrese el peso");
                peso = s.nextDouble();
                jugador = new SoccerPlayer(nombre,edad,numero,posicion,nacionalidad,altura,peso);
                equipo.getTeam().add(jugador);
                System.out.println("Jugador Agregado");
                System.out.println("Datos: "+jugador);
                break;
    
            case 2:
                System.out.println("Ingrese le Nombre del jugador a eliminar");
                nombre = s.next();
                equipo.borrar(nombre);
                break;
                
            case 3:
                System.out.println("Ingrese le Nombre para actualiza sus datos");
                nombre = s.next();
                System.out.println("Ingrese la edad del jugador");
                edad = s.nextInt();
                System.out.println("Ingresa el numero del jugador");
                numero = s.nextInt();
                System.out.println("Ingrese la posicion");
                posicion = s.next();
                System.out.println("Ingrese la altura");
                altura =  s.nextDouble();
                System.out.println("Ingrese el peso");
                peso = s.nextDouble();
                equipo.update(nombre, edad, numero, posicion, altura, peso);
                break;
                
            default:
                System.out.println("Opcion no valida");
        }
            System.out.println("1.Menu\n2.Salir");
            loop = s.nextInt();
        }while(loop != 2);
        
    }
}
