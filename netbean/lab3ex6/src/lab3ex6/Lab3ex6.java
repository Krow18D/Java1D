package lab3ex6;
public class Lab3ex6 {
    public static void main(String[] args) {
       int eq,pt,num=2;
       boolean pt2;
       for(int counter=0;counter<100;)
       {
           pt=prime(num);
           if(pt==0)pt2=false;
           else pt2=true;
           String strnum = Integer.toString(num);   
           String revnum =new StringBuffer(strnum).reverse().toString();
           if(pt2&&(strnum.equals(revnum)))
           {
               System.out.print(num+" ");
               counter++;
               if(counter%10==0&&counter!=0)System.out.println("");
           }
           num++;
       }
    }
    public static int prime(int num)
    {
        int c=0;
        for(int i =1;i<num;i++)
        {
            if(num%i==0)c++;
            if(c>1)break;
        }
        if(c>1)c=0;
        return c;
    }
}