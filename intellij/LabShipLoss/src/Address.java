import java.util.ArrayList;
import java.util.List;

public class Address {
    String dorm;
    List<Student> studentList = new ArrayList<>();

    public Address() {
    }

    public Address(String dorm) {
        this.dorm = dorm;
    }
    void addstudent(Student e)
    {
        if(studentList.size()<3)
        studentList.add(e);
    }
    public String getDorm() {
        return dorm;
    }

    public void setDorm(String dorm) {
        this.dorm = dorm;
    }


    @Override
    public String toString() {
        return "Dorm : " + dorm +
                " | Number of Student : "+studentList.size();
    }
}
