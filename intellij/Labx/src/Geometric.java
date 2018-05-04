import java.util.Date;

public abstract class Geometric {
    private String color;
    private Date datecreate = new Date();

    public Geometric(String color) {
        this.color = color;
        datecreate = new Date();
    }

    public String getColor() {
        return color;
    }

    public Date getDatecreate() {
        return datecreate;
    }
    public abstract double getArea();
}
