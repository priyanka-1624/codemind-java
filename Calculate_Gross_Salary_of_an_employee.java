import java.util.Scanner;
public class Salary
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        float sal=sc.nextFloat();
        float hra=sc.nextFloat();
        float da=sc.nextFloat();
        float pf=sal*((float)0.12);
        System.out.printf("%.2f
",pf);
        float gs=pf+sal+hra+da;
        System.out.printf("%.2f
",gs);
        
    }
}