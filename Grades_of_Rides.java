import java.util.Scanner;
public class ArraySum
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int hf=sc.nextInt();
        int sp=sc.nextInt();
        int ff=sc.nextInt();
        if(hf>50 && sp>60 && ff>100)
        {
            System.out.println(10);
        }
        else if(hf>50 && sp>60)
        {
            System.out.println(9);
        }
        else if(sp>60 && ff>100)
        {
            System.out.println(8);
        }
        else if(hf>50 && ff>100)
        {
         System.out.println(7);   
        }
        else if(hf>50 ||sp>60 ||ff>100)
        {
        System.out.println(6);
    }
    else
    {
        System.out.println(5);
    }
    }
}