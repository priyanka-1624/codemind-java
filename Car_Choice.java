import java.util.Scanner;
public class CarCost
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t>0)
        {
            float x1=sc.nextFloat();
            float x2=sc.nextFloat();
            float y1=sc.nextFloat();
            float y2=sc.nextFloat();
            float car1=x1/y1;
            float car2=x2/y2;
            if(car1>car2)
            {
                System.out.println(-1);
            }
            if(car1==car2)
            {
                System.out.println(0);
            }
            if(car2>car1)
            {
                System.out.println(1);
            }
            t--;
        }
    }
}