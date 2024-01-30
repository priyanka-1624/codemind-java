import java.util.Scanner;

public class Voting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1=sc.nextInt();
        int x2=sc.nextInt();
        int y2=sc.nextInt();
        int z1=x1+y1;
        int z2=x2+y2;
        if(z1<z2)
        {
            System.out.println(z1);
        }
        else
        {
            System.out.println(z2);
        }
    }
}
