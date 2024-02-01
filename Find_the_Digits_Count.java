import java.util.Scanner;
public class EvenCoins
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int digitCount=0,r;
        while (n>0)
        {
            r=n%10;
            digitCount++;
            n=n/10;
            
            
        }
        System.out.println(digitCount);
    }
}