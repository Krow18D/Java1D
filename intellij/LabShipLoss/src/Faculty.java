import java.util.ArrayList;
import java.util.List;

public class Faculty {
    Name name;
    List<Course> courseList =new ArrayList<>();
    String mes="";
    public void addcourse(Course e)
    {
        courseList.add(e);
        if(courseList.size()>3)mes="You can't add course more than 3";
    }
    public Faculty(Name name) {
        this.name = name;
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
        if(courseList.size()==0)return "N/A";
        if(!(mes.equals(temp)))return mes;
        else {
            for(Course i : courseList)
            {
                temp+=i.getName()+" ";

            }
        }
        return temp;
    }

    @Override
    public String toString() {
        return "Teacher Name : " + name +
                " | Course List : " + getcourselist();
    }
}
