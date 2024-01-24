import java.util.Scanner;
public class InchCen
{
    public static void  main(String[] args)
    {
        Scanner sc=new Scanner( System.in);
        int inch=sc.nextInt();
        System.out.printf("%.2f",inch*2.54);
    }
}