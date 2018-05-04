/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4ex9p11;

/**
 *
 * @author karin
 */
public class LinearEquation {
    private double a,b,c,d,e,f,x,y;
    LinearEquation(double a,double b,double c,double d,double e,double f)
    {
        this.a=a;
        this.b=b;
        this.c=c;
        this.d=d;
        this.e=e;
        this.f=f;
    }
    boolean isSolvable()
    {
        if((a*d)-(b*c)==0)return false;
        else return true;
    }
    double getX()
    {
        x=((e*d)-(b*f))/((a*d)-(b*c));
        return x;
    }
    double getY()
    {
        y=((a*f)-(e*c))/((a*d)-(b*c));
        return y;
    }
    
}
