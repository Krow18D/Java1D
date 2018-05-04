package lab3ex7;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Lab3ex7 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> arrlist1=new ArrayList<Integer>();
        ArrayList<Integer> arrlist2=new ArrayList<Integer>();
        ArrayList<Integer> result=new ArrayList<Integer>();
        String list1,list2;
        System.out.println("Enter List1 : ");
        list1=sc.nextLine();
        System.out.println("Enter List2 : ");
        list2=sc.nextLine();
        String[] nlist1=list1.split(" ");
        String[] nlist2=list2.split(" ");
        for(String l1:nlist1)
        {
            arrlist1.add(Integer.parseInt(l1));
        }
        for(String l2:nlist2)
        {
            arrlist2.add(Integer.parseInt(l2));
        }
        result=merge(arrlist1,arrlist2);
        for(int i=0;i<result.size();i++)
        {
            System.out.print(result.get(i)+" ");
        }
    }
    public static ArrayList<Integer> merge(ArrayList<Integer> list1,ArrayList<Integer> list2)
    {
        ArrayList<Integer> mergeList=new ArrayList<Integer>();
        for(int i:list1)
            mergeList.add(i);
        for(int j:list2)
        {
            mergeList.add(j);
        }
        Collections.sort(mergeList);
        return mergeList;
    }
}