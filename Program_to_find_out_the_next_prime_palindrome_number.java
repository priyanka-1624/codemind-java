import java.util.Scanner;
public class ArraySum
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=n+1;i<=100000;i++)
        {
            int t=i;
            int r=0,s=0;
            while(t>0)
            {
                r=t%10;
                s=r+s*10;
                t=t/10;
            }
            if(s==i)
            {
                int c=0;
                for(int j=1;j<=i;j++)
                {
                   if(i%j==0)
                   {
                       c=c+1;
                   }
                }
                if(c==2)
                {
                System.out.println(i);
                break;
                }
              }
        }
    }
}