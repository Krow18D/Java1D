
import java.time.LocalDate;
public class Person {
    private String title ,firstname,lastname;
    private String titleth ,firstnameth,lastnameth;
    private LocalDate dob;

    public Person() {
    }

    public Person(String title, String firstname, String lastname, LocalDate dob) {
        this.title = title;
        this.firstname = firstname;
        this.lastname = lastname;
        this.dob = dob;
    }

    public Person(String title, String firstname, String lastname, String titleth, String firstnameth, String lastnameth, LocalDate dob) {
        this.title = title;
        this.firstname = firstname;
        this.lastname = lastname;
        this.titleth = titleth;
        this.firstnameth = firstnameth;
        this.lastnameth = lastnameth;
        this.dob = dob;
    }

    public String getTitleth() {
        return titleth;
    }

    public void setTitleth(String titleth) {
        this.titleth = titleth;
    }

    public String getFirstnameth() {
        return firstnameth;
    }

    public void setFirstnameth(String firstnameth) {
        this.firstnameth = firstnameth;
    }

    public String getLastnameth() {
        return lastnameth;
    }

    public void setLastnameth(String lastnameth) {
        this.lastnameth = lastnameth;
    }

    @Override
    public String toString() {
        return "Person{" +
                "title='" + title + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", titleth='" + titleth + '\'' +
                ", firstnameth='" + firstnameth + '\'' +
                ", lastnameth='" + lastnameth + '\'' +
                ", dob=" + dob +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }
}
