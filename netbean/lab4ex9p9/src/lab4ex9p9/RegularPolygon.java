
package lab4ex9p9;

public class RegularPolygon {
    private int  n ;
    private double lside;
    RegularPolygon(int n,double lside)
    {
        this.n = n;
        this.lside = lside;
    }
    double getParimeter()
    {
        return n*lside;
    }
    double getArea()
    {
        return (n*lside*lside)/(4*Math.tan(Math.PI/n));
    }
}
