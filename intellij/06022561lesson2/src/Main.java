import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        demo1();
    }

    public  static void demo1()
    {
        Team teamA = new Team();
        teamA.setTeamname("AFlow");
        teamA.setCity("Hokkaido");
        List<Player> players =new ArrayList<Player>();
        players.add(new Player("Jetsupa","Kruetang","Guitar", LocalDate.of(1994, Month.APRIL,8)));
        players.add(new Player("Punsikorn","Tiyakorn","Drummer",LocalDate.of(2000,Month.NOVEMBER,9)));
        teamA.setPlayers(players);
        System.out.println(teamA);
    }
}
