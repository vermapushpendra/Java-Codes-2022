import java.util.*;

public class factorialfunction {
    public static int printfactorial(int n) {
        if (n < 0) {
            System.out.println("There is no factorial for -ve numbers");
            return 0;
        }
        int factorial = 1;
        for (int i = n; i >= 1; i--) {
            factorial = factorial * i;
        }
        return factorial;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int factorial = printfactorial(n);
        System.out.println(factorial);

    }
}
