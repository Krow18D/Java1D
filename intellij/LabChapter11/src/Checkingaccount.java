public class Checkingaccount extends Account {
    private double overdraftlimit =1000.0;
    public Checkingaccount(int id , double balance , double annualInterestRate) {
        super(id,balance,annualInterestRate);
    }
    @Override
    public void deposit(double dep) {
        super.deposit(dep);
    }

    @Override
    public void withdraw(double wit) {
        if(getBalance()-wit>= -overdraftlimit)
        super.withdraw(wit);

    }
    @Override
    public String toString() {
        return "CheckingaccountID : "+getId()+
                ", balance : "+getBalance()+
                ", datecreate : "+getDatecreate()
                ;
    }
}
