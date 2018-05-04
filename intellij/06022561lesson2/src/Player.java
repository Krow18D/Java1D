import java.time.LocalDate;

public class Player {
    private String fristname,lastname,position;
    private LocalDate dob;

    public Player(String fristname, String lastname, String position, LocalDate dob) {
        this.fristname = fristname;
        this.lastname = lastname;
        this.position = position;
        this.dob = dob;
    }

    public Player(){

    }

    @Override
    public String toString() {
        return "Player{" +
                "fristname='" + fristname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", position='" + position + '\'' +
                ", dob=" + dob +
                '}';
    }

    public String getFristname() {
        return fristname;
    }

    public void setFristname(String fristname) {
        this.fristname = fristname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }
}
