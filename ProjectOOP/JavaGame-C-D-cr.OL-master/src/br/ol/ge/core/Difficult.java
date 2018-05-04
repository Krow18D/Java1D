

package br.ol.ge.core;


/**
 *
 * @author karin
 */



/**** implemented for 60/2 OOP ****/
public class Difficult {

    
  public static enum Diffi{EASY , NORMAL ,HARD};  
 private static Diffi diff= Diffi.EASY;
    
    public static Diffi getDiff(){
        return diff;
    }
    public static void setDiff(Diffi p)
    {
        diff = p;
    }
  
  
}
