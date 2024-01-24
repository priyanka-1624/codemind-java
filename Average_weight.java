import java.util.Scanner;
public class AvgWeight
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int avg=sc.nextInt();
        int boy1=sc.nextInt();
        int boy2=sc.nextInt();
        System.out.println((avg*3-boy1-boy2));
    }
}