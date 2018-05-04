/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pooh
 */
public class Foo implements java.io.Serializable {  
  private int v1=100;
  public static double v2;
  private transient A v3 = new A();
  public int getV1(){return v1;}
}
class A { }