public class Candy extends DessertItem {
    private double weight;
    private double priceperpound;

    public Candy(String name, double weight, double priceperpound) {
        super(name);
        this.weight = weight;
        this.priceperpound = priceperpound;
    }

    @Override
    public int getCost() {
        return (int)Math.round(weight*priceperpound);
    }

    @Override
    public String toString() {
        return "Candy{" +
                "priceperpound=" + priceperpound +
                ", name='" + name + '\'' +
                '}';
    }
}
