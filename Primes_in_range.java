import java.util.Scanner;
public class PrimesInRange
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int count=0;
        for(int i=m;i<=n;i++)
        {
            int c=0;
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
                c++;
            }
            if(c==2)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}