import java.util.*;

public class countingofpositiveNegativeOrZero {
    public static void main(String args[]) {
        int positive = 0, negative = 0, zeros = 0;
        // System.out.println("Enter 1 if you want continue or 0 for stop");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        while (input == 1) {
            System.out.println("Enter your Number:");
            int number = sc.nextInt();
            if (number > 0) {
                positive++;
            } else if (number < 0) {
                negative++;
            } else {
                zeros++;
            }
            System.out.println("Enter 1 if you want continue or 0 for stop");
            input = sc.nextInt();

        }
        System.out.println("positive number: " + positive);
        System.out.println("negative number: " + negative);
        System.out.println("zero: " + zeros);
    }
}
