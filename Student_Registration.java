import java.util.Scanner;
public class EnrollReg
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while (T>0)
        {
            int n=sc.nextInt();
            int m=sc.nextInt();
            int k=sc.nextInt();
             if((n+k)<=m)
             {
                 System.out.println("YES");
             }
             else
             {
                 System.out.println("NO");
             }
             T--;
        }
    }
}