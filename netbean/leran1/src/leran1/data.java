package leran1;
import java.util.Scanner; 
public class data {
    Scanner scanz = new Scanner(System.in);
    String name ="Ha";
    int age=9,i;
    int[] arr ={1,2,3,4,5};
    public void funx()
    {
        System.out.println("Enter 5 int test array and for loop");
        for(i=0;i<5;i++)
        {
            arr[i] = scanz.nextInt();
        }
        System.out.println(""+arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]);
    }
}
