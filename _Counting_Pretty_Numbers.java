import java.util.Scanner;
public class PrettyNumbers
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0)
        {
            int l=sc.nextInt();
            int r=sc.nextInt();
            int prettyNumbers=0;
            for(int i=l;i<=r;i++)
            {
                if(i%10==2 || i%10==3 || i%10==9)
                    prettyNumbers+=1;       
            }
            System.out.println(prettyNumbers);
        }
    }
}