public class Cookie extends DessertItem {
    private double number;
    private double priceperdozen;

    public Cookie(String name, double number, double priceperdozen) {
        super(name);
        this.number = number;
        this.priceperdozen = priceperdozen;
    }

    @Override
    public int getCost() {
        return (int)Math.round((number*priceperdozen)/12);
    }

    @Override
    public String toString() {
        return "Cookie{" +
                "priceperdozen=" + priceperdozen +
                ", name='" + name + '\'' +
                '}';
    }
}
