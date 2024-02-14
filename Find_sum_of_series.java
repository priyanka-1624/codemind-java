import java.util.Scanner;
public class SeriesSum
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=1,d=1;
        float sum=0;
        for(int i=1;i<=n;i++)
        {
            sum+= 1.0f/(a+(i-1)*d);
        }
        System.out.printf("%.2f",sum);
    }
}