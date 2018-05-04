package lab4ex9p11;
import java.util.Scanner;
public class Lab4ex9p11 {
    public static void main(String[] args) {
        double a,b,c,d,e,f;
        Scanner sn = new Scanner(System.in);
        a=sn.nextDouble();
        b=sn.nextDouble();
        c=sn.nextDouble();
        d=sn.nextDouble();
        e=sn.nextDouble();
        f=sn.nextDouble();
        LinearEquation lieq = new LinearEquation(a,b,c,d,e,f);
        if(lieq.isSolvable()==false)
        {
            System.out.println("The equation has no solution.");
        }
        else 
        {
            System.out.println(""+lieq.getX());
            System.out.println(""+lieq.getY());
        }
    }
    
}
