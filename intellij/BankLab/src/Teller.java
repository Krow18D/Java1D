import java.time.LocalDateTime;
import java.util.ArrayList;

public class Teller {
    private static int acctnum=100;
    private LocalDateTime date;
    public Teller() {
    }
    public void newAccount(Customer cust,double initAmount)
    {
        //Create account
        Account acc = new Account(acctnum++,initAmount);
        cust.addBankAccount(acc);
    }
    public void deposit(Customer cust,int acctnum,double deposit)
    {
        //deposit code
        ArrayList<Account> list =cust.getlistbankaccount();
        boolean found = false;
        for(int i =0;i<list.size();i++)
        {
            Account acc = list.get(i);
            if(acc.getId()==acctnum)
            {
                acc.computeDeposit(deposit);
                found=true;
                date = LocalDateTime.now();
                if(found) {
                    Transcation tran = new Transcation(date, 'd', deposit, acc.getBalance(), "happy");
                    acc.addtran(tran);
                }
                break;
            }
        }
    }
    public void withdraw(Customer cust,int acctnum,double withdraw)
    {
        //withdraw code
        ArrayList<Account> list =cust.getlistbankaccount();
        boolean found = false;
        for(int i =0;i<list.size();i++)
        {
            Account acc = list.get(i);
            if(acc.getId()==acctnum)
            {
                acc.computeWithdraw(withdraw);
                found=true;
                date = LocalDateTime.now();
                if(found) {
                    Transcation tran = new Transcation(date, 'w', withdraw, acc.getBalance(), "sad");
                    acc.addtran(tran);
                }
                break;
            }
        }
    }
}
