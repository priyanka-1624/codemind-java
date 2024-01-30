import java.util.Scanner;
public class DragonFruit
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int c=0;
        for (int i = 1; i < x; i++) {
		for (int j = 1; j < x; j++) {
			if ((i % 2 == 0) && (j % 2 == 0) && (i + j == x)) {
				c=c+1;
				break;
			}
		}
	}
	if(c==0)
	{
	System.out.println("NO");
    }
    else
    {
        System.out.println("YES");
    }
}
}