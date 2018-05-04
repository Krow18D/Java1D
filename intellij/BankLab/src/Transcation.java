import java.time.LocalDateTime;
public class Transcation {
    private LocalDateTime date;
    private char type;
    private double amount,balance;
    private String description;

    public Transcation() {
    }

    public Transcation(LocalDateTime date, char type, double amount,
                       double balance, String description) {
        this.date = date;
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Transcation{" +
                "date=" + date +
                ", type=" + type +
                ", amount=" + amount +
                ", balance=" + balance +
                ", description=" + description +
                '}'+"\n";
    }
}
