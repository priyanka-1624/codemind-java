import java.util.Scanner;
public class AvgWeight
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int hrs=a/3600;
        int min=(a%3600)/60;
        int sec=(a%3600)%60;
        System.out.printf("H:M:S-%d:%d:%d",hrs,min,sec);
        
       
    }
}