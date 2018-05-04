package lab3ex8;
import java.util.Scanner;
public class Lab3ex8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean c=true,r=true;
        int num,i,j,temp=0;
        int[] d,superd,subd;
        int[][] countercol,counterrow;
        countercol=new int[2][1001];
        counterrow=new int[2][1001];
        d=new int[2];
        superd=new int[2];
        subd=new int[2];
        int[][] mat=new int[1001][1001];
        System.out.print("Enter Size for the Matrix: ");
        num = sc.nextInt();
        for(i=0;i<num;i++)
        {
            for(j=0;j<num;j++)
            {
                mat[i][j]=(int)(Math.random()*2);
            }
        }
        //j=column i=rows
        for(i=0;i<num;i++)
        {
            for(j=0;j<num;j++)
            {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println("");
        }
        //column
        while(temp<=1)
        {
            for(i=0;i<num;i++)
            {   
                for(j=0;j<num;j++)
                {
                   if(mat[i][j]==temp)countercol[temp][j]++;
                   if(mat[i][j]==temp)counterrow[temp][i]++;
                }
            }
            for(i=0;i<num;i++)
            {
                if(mat[i][i]==temp)d[temp]++;
                if(i<num-1)
                {
                    if(mat[i][i+1]==temp)superd[temp]++;
                    if(mat[i+1][i]==temp)subd[temp]++;
                }
            }
            temp++;
        }
        temp=0;
        while(temp<=1)
        {
            for(i=0;i<num;i++)
            {   
                   if(counterrow[temp][i]==num)
                   {
                       System.out.println("All "+temp+"s on row"+i);
                       r=false;
                   }
            }
            for(i=0;i<num;i++)
            {   
                   if(countercol[temp][i]==num)
                   {
                       System.out.println("All "+temp+"s on column"+i);
                     c=false;  
                   }
            }
            if(superd[temp]==num-1)System.out.println("All "+temp+"s on the superdiagonal");
            if(d[temp]==num)System.out.println("All "+temp+"s on the diagonal");
            if(subd[temp]==num-1)System.out.println("All "+temp+"s on the subdiagonal");
            if(temp>0&&c)System.out.println("No same numbers on a column");
            if(temp>0&&r)System.out.println("No same numbers on a row");
            if(temp>0&&superd[0]!=num&&superd[1]!=num)System.out.println("No same Number on the superdiagonal");           
            if(temp>0&&d[0]!=num&&d[1]!=num)System.out.println("No same Number on the diagonal");            
            if(temp>0&&subd[0]!=num&&subd[1]!=num)System.out.println("No same Number on the subdiagonal");
            temp++;
        }
    }
}