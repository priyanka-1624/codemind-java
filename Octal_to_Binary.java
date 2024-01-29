import java.util.*;
public class OctalToBinary
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0)
        {
            int temp=Integer.parseInt(sc.nextLine(),8);
            String binary=Integer.toBinaryString(temp);
            System.out.println(binary);
        }
    }
}