import java.util.Date;

public class Circle extends Geometric{
//    private String color;
//    private Date datecreate = new Date();
    private double radius;


    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI*Math.pow(radius,2);
    }

    @Override
    public String toString() {
        return "Circle{" +
                " color :  "+getColor() +
                ", radius : " + radius +
                ", date : "+getDatecreate()+
                '}';
    }
}
