package leran1;
public class Leran1 {
    public static void main(String[] args) {
        data use1 = new data();
        data use2 = new data();
        System.out.println(use1.name);
        System.out.println(use1.age);
        System.out.println(use2.age);
        use1.funx();
        use2.age=15;
        System.out.println(use1.age);
        System.out.println(use2.age);
        use2.age=use1.age;
        System.out.println(use1.age);
        System.out.println(use2.age);
    }
}