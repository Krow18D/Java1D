import java.util.Date;

public class Rectangle extends Geometric{
//    private String color;
//    private Date datecreate = new Date();
    private int width;
    private int hight;

    public Rectangle(String color,int width, int hight) {
        super(color);
        this.width = width;
        this.hight = hight;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHight() {
        return hight;
    }

    public void setHight(int hight) {
        this.hight = hight;
    }

    @Override
    public double getArea() {
        return width*hight;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                " color : "+getColor()+
                ", width : " + width +
                ", hight : " + hight +
                ", date : "+getDatecreate()+
                '}';
    }
}
