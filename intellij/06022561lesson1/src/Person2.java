import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Person2 {
    private PersonName nameEN,nameTH;
    private LocalDate dob;
    private Map<String,String> phone =new HashMap<String,String>();

    public Map<String, String> getPhone() {
        return phone;
    }

    public void setPhone(Map<String, String> phone) {
        this.phone = phone;
    }

    public Person2(PersonName nameEN, PersonName nameTH, LocalDate dob) {
        this.nameEN = nameEN;
        this.nameTH = nameTH;
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Person2{" +
                "nameEN=" + nameEN +
                ", nameTH=" + nameTH +
                ", dob=" + dob +
                ", phone=" + phone +
                '}';
    }

    public Person2() {
    }

    public PersonName getNameEN() {
        return nameEN;
    }

    public void setNameEN(PersonName nameEN) {
        this.nameEN = nameEN;
    }

    public PersonName getNameTH() {
        return nameTH;
    }

    public void setNameTH(PersonName nameTH) {
        this.nameTH = nameTH;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }
}
