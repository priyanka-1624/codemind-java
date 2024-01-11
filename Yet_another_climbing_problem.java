import java.util.Scanner;
public class Climbing
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        int i=1;
        while (i<=T)
        {
            int x=sc.nextInt();
            int y=sc.nextInt();
            int n=(x/y) + (x%y);
            System.out.println(n);
            i=i+1;
        } 
    }
}