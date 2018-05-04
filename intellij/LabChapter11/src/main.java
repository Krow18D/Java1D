public class main {
    public static void main(String[] args) {
        Savingaccount s1 = new Savingaccount(100,5000,5);
        Checkingaccount c1 = new Checkingaccount(101,4000,4);
        System.out.println(s1);
        System.out.println(c1);

        s1.deposit(1000);
        c1.deposit(2000);
        System.out.println("After deposit");
        System.out.println(s1);
        System.out.println(c1);

        s1.withdraw(4000);
        c1.withdraw(5000);
        System.out.println("After Withdraw");
        System.out.println(s1);
        System.out.println(c1);

        //over withdraw
        s1.withdraw(3000);
        c1.withdraw(2000);
        System.out.println("After Overwithdraw");
        System.out.println(s1);
        System.out.println(c1);
    }
}
