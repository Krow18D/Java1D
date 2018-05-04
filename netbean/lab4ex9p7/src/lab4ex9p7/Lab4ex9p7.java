
package lab4ex9p7;

public class Lab4ex9p7 {
    public static void main(String[] args) {
        Account account = new Account(1122,20000,4.5);
        account.withdraw(2500);
        account.deposit(3000);
        System.out.println("ID : "+account.getId());
        System.out.println("Initial Balance : "+account.getnBalance());
        System.out.println("Current Balance : "+account.getbalance());
        System.out.println("MonthlyInterest : "+account.getMonthlyInterest());
        System.out.println("Date when create : "+account.getdate());
    }
    
}
