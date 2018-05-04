
package lab4ex9p7;
import java.util.Date;
public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private double nb;
    private Date dateCreated;
    public Account()
    {
        
    }
    public Account(int id,double balance,double annualInterestRate)
    {
        this.id=id;
        this.balance=balance;
        this.nb=balance;
        this.annualInterestRate=annualInterestRate;
    }
    public double getnBalance() {
        return nb;
    }
    public double getbalance()
    {
        return balance;
    }

    public int getId() {
        return id;
    }
    public Date getdate()
    {
        this.dateCreated=new Date();
        return dateCreated;
    }
    public double getMonthlyInterestRate()
    {
        return annualInterestRate/(12*100);
    }
    public double getMonthlyInterest()
    {
        
        return balance*getMonthlyInterestRate();
    }
    public double withdraw(double money)
    {
        balance-=money;
        return balance;
    }
    public double deposit(double money)
    {
        balance+=money;
        return balance;
    }
    
    
}
