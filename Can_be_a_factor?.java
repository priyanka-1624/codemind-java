import java.util.Scanner;
public class Factor
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t>0)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int z=Math.abs(a-b);
            if(z>=a || a==b)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
            t=t-1;
        }
    }
}