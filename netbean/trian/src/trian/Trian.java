
package trian;
import java.util.Scanner;
import java.awt.geom.Point2D;
public class Trian {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a,b,c,x1=2,x2=3,y1=4,y2=5,x3=6,y3=7;
        Point2D p1 =new Point2D.Double(x1,y1);
        Point2D p2 =new Point2D.Double(x2,y2);
        Point2D p3 =new Point2D.Double(x3,y3);
        a=p1.distance(p2);
        b=p2.distance(p3);
        c=p3.distance(p1);
        triangle tri=new triangle(a,b,c);
        System.out.println(""+tri.getArea());
    }
    
}
