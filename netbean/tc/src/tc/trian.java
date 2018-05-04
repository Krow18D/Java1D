
package tc;
import java.util.Scanner;
public class trian {
    Scanner sn = new Scanner(System.in);
    double area,s,sA,sB,sC;
    String color;
    void input()
    {
        System.out.print("A=");
        sA=sn.nextDouble();
        System.out.print("B=");
        sB=sn.nextDouble();
        System.out.print("C=");
        sC=sn.nextDouble();
    }
    
    double getArea()
    {
        s=(sA+sB+sC)/2;
        area=Math.sqrt(s*(s-sA)*(s-sB)*(s-sC));
        return area;
    }
    double getParamiter()
    {
        return (sA+sB+sC);
    }
//    setColor()
//    {
//        
//    }
//    getColor()
//    {
//        
//    }
    
}
