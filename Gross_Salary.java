import java.util.Scanner;
public class GrossSalary
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        double s=sc.nextDouble();
        if(s<=10000)
        {
            System.out.printf("%.2f",(s+(0.8)*s+(0.2)*s));
        }
        else if(s<=20000)
        {
            System.out.printf("%.2f",(s+0.9*s+0.25*s));
        }
        else
        {
            System.out.printf("%.2f",(s+0.95*s+0.3*s));
        }
    }
}