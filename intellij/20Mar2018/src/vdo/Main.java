package vdo;

import java.lang.reflect.Member;

public class Main {

    public static void main(String[] args) {
        demo5();
    }

    public static void demo1() {
        SilverCard c1 = new SilverCard();
        System.out.println(c1.discount(100f));

        GoldCard c2 = new GoldCard();
        System.out.println(c2.discount(100f));
    }

    public static void demo2() {
        MemberCard c1 = new SilverCard();
        System.out.println(c1.discount(100f));

        MemberCard c2 = new GoldCard();
        System.out.println(c2.discount(100f));

        MemberCard c3 = new PlatinumCard();
        System.out.println(c3.discount(100f));

        MemberCard c4 = new DiamondCard();
        System.out.println(c4.discount(100f));
    }

    public static void demo5() {
        MemberCard c1 = new SilverCard();
        receipt(c1, 100f);

        MemberCard c2 = new DiamondCard();
        receipt(c2, 100f);
    }

    public static void receipt(MemberCard c, float amount) {
        System.out.println(c.getClass().getName());
        System.out.printf("1amount   = %10.2f%n", amount);
        System.out.printf("1discount = %10.2f%n", c.discount(amount));
        System.out.printf("1net      = %10.2f%n", amount - c.discount(amount));
    }

    public static void demo3() {
        MemberCardV2 c1 = new MemberCardV2();
        c1.setLevel("S");
        System.out.println(c1.discount(100f));

        MemberCardV2 c2 = new MemberCardV2();
        c2.setLevel("G");
        System.out.println(c2.discount(100f));

        MemberCardV2 c3 = new MemberCardV2();
        c3.setLevel("P");
        System.out.println(c3.discount(100f));

        MemberCardV2 c4 = new MemberCardV2();
        c4.setLevel("D");
        System.out.println(c4.discount(100f));
    }
}
