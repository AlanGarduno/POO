
package test;
import Sources.*;

public class TestTeam 
{
    public static void main(String[] args) 
    {
        SoccerPlayer Messi = new SoccerPlayer("Lionel",30,10,"Medio","Argentino",1.60,70.8);
        Team RealMadrid = new Team();
        RealMadrid.getTeam().add(Messi);
        RealMadrid.buscaNombre("Lionel");
        
    }
}
