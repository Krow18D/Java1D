import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Account {
    private int id;
    private double balance,annuallinterest;
    private LocalDateTime dateCreate;
    private ArrayList<Transcation> tranlist=new ArrayList();

    public Account() {
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        this.dateCreate = LocalDateTime.now();
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

    public double getmonthlyinterrestRate()
    {
        double mir=0;
        return mir;
    }
    public double getmonthlyinterrest()
    {
        double mi=0;
        return mi;
    }
    public void addtran(Transcation e)
    {
        tranlist.add(e);
    }
    public void computeDeposit(double deposit)
    {
        balance+=deposit;
    }
    public void computeWithdraw(double withdraw)
    {
        balance-=withdraw;
    }

    public ArrayList<Transcation> getListtran() {
        return tranlist;
    }
    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", balance=" + balance +
                ", annuallinterest=" + annuallinterest +
                ", dateCreate=" + dateCreate +
                "\n"+ getListtran() +
                '}';
    }
}
