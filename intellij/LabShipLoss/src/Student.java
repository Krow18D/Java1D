import java.util.ArrayList;
import java.util.List;

public class Student {
    Name name;
    List<Address> addressList=new ArrayList<>();
    List<Course> courseList=new ArrayList<>();

    public Student(Name name) {
        this.name = name;
    }

    void addcourse (Course e)
    {
        courseList.add(e);
    }

    void addaddress(Address e)
    {
        if(e.studentList.size()<3&&addressList.size()<1)
        addressList.add(e);

    }
    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public String getcourselist()
    {
        String temp="";
        for(Course i : courseList)
            temp+=i.getName()+" ";
        return temp;
    }

    public String getdorm()
    {
        String temp="N/A";
        for(Address i : addressList)
        {
            temp=i.getDorm();
        }
        return temp;
    }
    @Override
    public String toString() {
        return "Student Name : " + name +
                " | Dorm : " + getdorm() +
                " | Course List : " + getcourselist();
    }
}
