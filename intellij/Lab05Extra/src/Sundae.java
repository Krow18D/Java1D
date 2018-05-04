public class Sundae extends IceCream {
    private String toppingname;
    private int costoftopping;

    public Sundae(String name, int cost, String toppingname,int costoftopping) {
        super(name, cost);
        this.costoftopping = costoftopping;
    }

    @Override
    public int getCost() {
        return super.getCost()+costoftopping;
    }

    @Override
    public String toString() {
        return "Sundae{" +
                "costoftopping=" + costoftopping +
                ", name='" + name + '\'' +
                '}';
    }
}
