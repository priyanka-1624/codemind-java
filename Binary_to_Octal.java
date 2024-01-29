import java.util.*;
public class BinToOctal
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0)
        {
            int temp=Integer.parseInt(sc.nextLine(),2);
            String octal=Integer.toOctalString(temp);
            System.out.println(octal);
        }
    }
}