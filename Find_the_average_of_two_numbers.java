import java.util.Scanner;
public class AvgNum
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        float a=sc.nextFloat();
        float b=sc.nextFloat();
        System.out.printf("%.4f",(a+b)/2);
    }
}