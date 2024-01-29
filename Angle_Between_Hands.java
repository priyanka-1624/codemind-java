import java.util.Scanner;

public class ClockAngle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input time in HH:MM format
        String time = scanner.nextLine();

        // Extract hours and minutes from the input time
        int h = Integer.parseInt(time.substring(0, 2));
        int m = Integer.parseInt(time.substring(3));

        // Calculate the angle between hour and minute hands
        double a = (30 * h) - (5.5 * m);
        a=Math.abs(a);
        double b = 360 - a;

        // Determine the minimum angle and print the result
        double minAngle = a < b ? a : b;
        System.out.println(minAngle);

        scanner.close();
    }
}
