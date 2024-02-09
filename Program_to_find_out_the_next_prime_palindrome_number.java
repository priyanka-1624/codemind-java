import java.util.Scanner;
public class NextPrimePalindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int nextPrimePalindrome = findNextPrimePalindrome(n);
        System.out.println(nextPrimePalindrome);
    }

    public static int findNextPrimePalindrome(int n) {
        while (true) {
            n++;
            if (isPalindrome(n) && isPrime(n))
                return n;
        }
    }

    public static boolean isPalindrome(int n) {
        String str = Integer.toString(n);
        int len = str.length();
        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - i - 1))
                return false;
        }
        return true;
    }

    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        if (n <= 3)
            return true;
        if (n % 2 == 0 || n % 3 == 0)
            return false;
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
        }
        return true;
    }
}