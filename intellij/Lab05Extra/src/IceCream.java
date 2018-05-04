public class IceCream extends DessertItem {
    private int cost;

    public IceCream(String name, int cost) {
        super(name);
        this.cost = cost;
    }

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "IceCream{" +
                "cost=" + cost +
                ", name='" + name + '\'' +
                '}';
    }
}
