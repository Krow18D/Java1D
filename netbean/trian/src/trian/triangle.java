/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trian;

/**
 *
 * @author karin
 */
public class triangle {
    private double a,b,c;
    private static int numofobject;
    triangle(double a,double b,double c)
    {
        this.a=a;
        this.b=b;
        this.c=c;
        numofobject++;
    }
    double getArea()
    {
        double p=(a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c)); 
    }
}
