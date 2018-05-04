import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        Teller t = new Teller();
        Customer c1 = new Customer("Oat","BKK",'M',19);
        t.newAccount(c1,500);
        t.newAccount(c1,1000);
        System.out.println(c1);

        t.deposit(c1,100,500);
        t.withdraw(c1,100,200);
        System.out.println(c1);

        t.deposit(c1,101,1200);
        t.withdraw(c1,101,500);
        System.out.println(c1);

        System.out.println("Transaction info");
        ArrayList<Account> list =c1.getlistbankaccount();
        for(Account account : list )
        {
            System.out.println(account);
        }
    }
}
