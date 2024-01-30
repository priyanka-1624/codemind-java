import java.util.Scanner;
public class Grade
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        int p=sc.nextInt();
        int q=sc.nextInt();
        int percent=((x+y+z+p+q)*100)/500;
        if (percent>=90)
        {
            System.out.println("Grade A");
        }
        else if(percent>=80)
        {
            System.out.println("Grade B");
        }
        else if(percent>=70)
        {
            System.out.println("Grade C");
        }
        else if(percent>=60)
        {
            System.out.println("Grade D");
        }
        else if(percent>=40)
        {
            System.out.println("Grade E");
        }
        else
        {
            System.out.println("Grade F");
        }
    }
}