import java.util.ArrayList;
import java.util.List;

public class Course {
    Name name,tname;
    int maxstu;
    List<Student> studentList = new ArrayList<>();
    List<Faculty> facultyList = new ArrayList<>();
    public Course(Name name, int maxstu) {
        this.name = name;
        this.maxstu = maxstu;
    }

    void addstudent(Student e)
    {
        if(studentList.size()<maxstu)
        studentList.add(e);
        else if(studentList.size()>maxstu) System.out.println("This course is FULL");
    }
    void setfaculty(Faculty e)
    {
        if(facultyList.size()<1)
        facultyList.add(e);
        else System.out.println("This course already has teacher");
    }
    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Name getTname() {
        return tname;
    }

    public void setTname(Name tname) {
        this.tname = tname;
    }

    public int getMaxstu() {
        return maxstu;
    }

    public void setMaxstu(int maxstu) {
        this.maxstu = maxstu;
    }
    public String gettname()
    {
        String temp="";
        for(Faculty i : facultyList)
        {
            temp+=i.name;
        }
        return temp;
    }
    @Override
    public String toString() {
        return "Course : " + name +
                " | Teacher Name : " + gettname() +
                " | Number of student : "+studentList.size();
    }
}
