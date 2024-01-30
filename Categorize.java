import java.util.Scanner;
public class Categorize
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        double x=sc.nextDouble();
        
        if(x<150)
        {
            System.out.println("Person is Dwarf.");
        }
        else if(x<=165)
        {
            System.out.println("Person is average heighted.");
        }
        else if(x<=195)
        {
            System.out.println("Person is taller.");
        }
        else
        {
            System.out.println("Abnormal height.");
        }
    }
}