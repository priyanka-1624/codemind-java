import java.util.Scanner;
public class EvenOrOdd
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<0)
        {
            System.out.println("Negative Number");
        }
        else
        {
            System.out.println("Positive Number");
        }
    }
}