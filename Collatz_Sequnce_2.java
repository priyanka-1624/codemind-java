import java.util.Scanner;
public class LargestCollatzSeries {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a =sc.nextInt(); // starting range
        int b = sc.nextInt(); // ending range

        int number = findNumberWithLargestCollatzSeries(a, b);
        System.out.println(number);
    }

    public static int findNumberWithLargestCollatzSeries(int a, int b) {
        int maxLength = 0;
        int number = 0;

        for (int i = a; i <= b; i++) {
            int length = collatzSeriesLength(i);
            if (length > maxLength) {
                maxLength = length;
                number = i;
            }
        }

        return number;
    }

    public static int collatzSeriesLength(long n) {
        int length = 1;

        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
            length++;
        }

        return length;
    }
}
