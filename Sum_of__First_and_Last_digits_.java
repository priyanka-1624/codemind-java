import java.util.Scanner;
public class EvenCoins
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int last=n%10;
        int first=0,r;
        while (n>0)
        {
            r=n%10;
            n=n/10;
            if(n<10)
            {
                first=n;
                break;
            }
            
        }
        System.out.println(last+first);
    }
}