package vdo2;

public class Main {

    public static void main(String[] args) {
	// write your code here
        demo2();
    }

    public static void demo1() {
        IMemberCard c1 = new SilverCard();
        System.out.println(c1.getClass().getName());
        System.out.println(c1.discount(100f));

        SilverCard c2 = new SilverCard();
        System.out.println(c2.getClass().getName());
        System.out.println(c2.discount(100f));


    }

    public static void demo2() {
        IMemberCard c1 = new SilverCard();
        receipt(c1, 100f);

        IMemberCard c2 = new PlatinumCard();
        receipt(c2, 100f);

        SilverCard c3 = new SilverCard();
        receipt2(c3, 100f);

        GoldCard c4 = new GoldCard();
        receipt2(c4, 100f);

        PlatinumCard c5 = new PlatinumCard();
        receipt2(c5, 100f);
    }

    public static void receipt(IMemberCard c, float amount) {
        System.out.printf("amount   = %10.2f%n", amount);
        System.out.printf("discount = %10.2f%n", c.discount(amount));
        System.out.printf("net      = %10.2f%n", amount - c.discount(amount));
    }

    public static void receipt2(SilverCard c, float amount) {
        System.out.printf("amount   = %10.2f%n", amount);
        System.out.printf("discount = %10.2f%n", c.discount(amount));
        System.out.printf("net      = %10.2f%n", amount - c.discount(amount));
    }

    public static void receipt2(GoldCard c, float amount) {
        System.out.printf("amount   = %10.2f%n", amount);
        System.out.printf("discount = %10.2f%n", c.discount(amount));
        System.out.printf("net      = %10.2f%n", amount - c.discount(amount));
    }

    public static void receipt2(PlatinumCard c, float amount) {
        System.out.printf("amount   = %10.2f%n", amount);
        System.out.printf("discount = %10.2f%n", c.discount(amount));
        System.out.printf("net      = %10.2f%n", amount - c.discount(amount));
    }


}
