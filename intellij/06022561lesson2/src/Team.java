import java.util.ArrayList;
import java.util.List;

public class Team {
    private String teamname,city;
    private List<Player> players = new ArrayList<Player>();

    public Team(String teamname, String city, List<Player> players) {
        this.teamname = teamname;
        this.city = city;
        this.players = players;
    }

    public Team() {
    }

    @Override
    public String toString() {
        return "Team{" +
                "teamname='" + teamname + '\'' +
                ", city='" + city + '\'' +
                ", players=" + players +
                '}';
    }

    public String getTeamname() {
        return teamname;
    }

    public void setTeamname(String teamname) {
        this.teamname = teamname;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }
}
