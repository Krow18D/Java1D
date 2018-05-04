import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date datecreate = new Date();

    public Account(int id,double balance,double annualInterestRate)
    {
        this.id=id;
        this.balance=balance;
        this.annualInterestRate=annualInterestRate;
        datecreate = new Date();
    }
    public void deposit(double dep)
    {
        balance += dep;
    }
    public void withdraw(double wit)
    {
        balance -= wit;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Date getDatecreate() {
        return datecreate;
    }

    public void setDatecreate(Date datecreate) {
        this.datecreate = datecreate;
    }
}
