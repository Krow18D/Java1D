import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        demo2();
    }

    public static void demo(){
        Person p1 = new Person("Mrs.","Jetsupa","Kruetang", LocalDate.of(1994, Month.APRIL,8));

        Person p2 =new Person("Mrs.","Jetsupa","Kruetang",
                "น.ส.","เจตสุภา","เครือแตง"
                ,LocalDate.of(1994, Month.APRIL,8));
        System.out.println(p2);
    }

    public static void demo2() {
    Person2 pp=new Person2();
    PersonName th = new PersonName("น.ส.","เจตสุภา","เครือแตง");
    PersonName en = new PersonName("Mrs.","Jetsupa","Kruetang");
    pp.setNameTH(th);
    pp.setNameEN(en);
    pp.setDob(LocalDate.of(1994,Month.APRIL,8));
        Map<String,String> phone =new HashMap<String,String>();
        phone.put("moblie","0845968343");
        phone.put("office","023333333");
        phone.put("home","022222222");
        pp.setPhone(phone);


        System.out.println(pp);

    }
}
