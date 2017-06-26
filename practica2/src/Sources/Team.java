
package Sources;
import java.util.ArrayList;
import Sources.*;

public class Team 
{
     private ArrayList<SoccerPlayer> team;
     
     public Team()
     {
         team = new ArrayList<>();
     }

    public ArrayList<SoccerPlayer> getTeam() 
    {
        return team;
    }
    
    public void buscaNombre(String nombre)
    {
        for (int i = 0; i < team.size(); i++)
        {
            if(nombre.equals(team.get(i).getName()))
            {
                System.out.println("Datos: "+team.get(i));
            }
        }
    }
    
    public void buscaPosicion(String posicion)
    {
        for (int i = 0; i < team.size(); i++)
        {
            if(posicion.equals(team.get(i).getPosition()))
            {
                System.out.println("Datos: "+team.get(i));
            }
            
        }
    }
    
    public void buscaNacionalidad(String nacionalidad)
    {
        for (int i = 0; i < team.size(); i++) 
        {
            if(nacionalidad.equalsIgnoreCase(team.get(i).getNationality()))
            {
                System.out.println("Datos: "+team.get(i));   
            }
            
        }
    }
    
    public void borrar(String nombre)
    {
        for (int i = 0; i < team.size(); i++)
        {
            if(nombre.equals(team.get(i).getName()))
            {
                team.remove(i);
                System.out.println("Jugador eliminado");
                break;
            }
            
        }
    }
    
    
    public void update(String nombre, int age, int number, String position, double height, double weight)
    {
        for (int i = 0; i < team.size(); i++)
        {
            if(nombre.equals(team.get(i).getName()))
            {
                System.out.println("Datos Actuales"+team.get(i).toString()); 
                team.get(i).setAge(age);
                team.get(i).setNumber(number);
                team.get(i).setHeight(height);
                team.get(i).setWeight(weight);
                team.get(i).setPosition(position);
                System.out.println("Datos Actualizados"+team.get(i).toString());
                break;
            }
            
        }
    }
     
     
     
    
}
