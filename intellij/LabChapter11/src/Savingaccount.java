public class Savingaccount extends Account {
    public Savingaccount(int id , double balance , double annualInterestRate) {
        super(id,balance,annualInterestRate);
    }

    @Override
    public void deposit(double dep) {
        super.deposit(dep);
    }

    @Override
    public void withdraw(double wit) {
        if(getBalance()-wit>=0)
        super.withdraw(wit);
    }

    @Override
    public String toString() {
        return "SavingaccountID : "+getId()+
                ", balance : "+getBalance()+
                ", datecreate : "+getDatecreate()
                ;
    }
}
