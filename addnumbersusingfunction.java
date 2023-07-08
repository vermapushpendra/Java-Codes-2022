import java.util.*;

public class addnumbersusingfunction {
    public static int addNumbers(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String args[]) {
        System.out.println("Enter numbers");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = addNumbers(a, b);
        System.out.println("Sum of 2 numbers " +  sum);

    }

}
