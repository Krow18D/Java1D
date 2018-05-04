public class main {
    public static void main(String[] args) {

        Address a1 = new Address("K1");
        Faculty f1 = new Faculty(new Name("Somsak"));
        Faculty f2 = new Faculty(new Name("Surin"));
        Course c1 = new Course(new Name ("oop"),60);
        Course c2 = new Course(new Name ("dis"),60);
        Course c3 = new Course(new Name ("cal"),60);
        Course c4 = new Course(new Name ("elec"),60);
        Student s1 = new Student(new Name("Oat"));
        Student s2 = new Student(new Name("Pun"));
        Student s3 = new Student(new Name("Jan"));
        Student s4 = new Student(new Name("PCher"));

        f1.addcourse(c1);
        c1.setfaculty(f1);
        f1.addcourse(c2);
        c2.setfaculty(f1);
        f1.addcourse(c3);
        c3.setfaculty(f1);
//        f1.addcourse(c4);
//        c4.setfaculty(f1);

        s1.addcourse(c1);
        s1.addcourse(c2);
        c1.addstudent(s1);
        c2.addstudent(s1);
        s1.addaddress(a1);
        a1.addstudent(s1);

        s2.addcourse(c1);
        s2.addaddress(a1);
        c1.addstudent(s2);
        a1.addstudent(s2);

        s3.addcourse(c1);
        s3.addaddress(a1);
        c1.addstudent(s3);
        a1.addstudent(s3);

        s4.addcourse(c1);
        s4.addaddress(a1);
        c1.addstudent(s4);
        a1.addstudent(s4);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(a1);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(f1);
        System.out.println(f2);

    }
}
