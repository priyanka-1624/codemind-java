import java.util.Scanner;
public class AreaTriangle
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        float a=sc.nextFloat();
        float b=sc.nextFloat();
        float c=sc.nextFloat();
        float s=(a+b+c)/2;
        System.out.printf("%.2f",Math.sqrt(s*(s-a)*(s-b)*(s-c)));
    }
}