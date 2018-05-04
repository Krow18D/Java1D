import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int net,min;
        String out="";
        Promotion[] promotions = {new GoNolimit699(), new GoNolimit899() ,new GoNolimit1299(),new GoNolimit1499() ,new GoNolimit1999()};
        Scanner sc = new Scanner(System.in);

        System.out.print("How many MIN Internet that you want : ");
        net = sc.nextInt();
        System.out.print('\n'+"How many MIN Minite that you want : ");
        min = sc.nextInt();
        System.out.println("");

        for(Promotion p : promotions)
        {
            if(p.getNet() >= net && p.getMincall()>= min)out+=p.getData()+'\n';
        }
        System.out.println(out);
    }
}
