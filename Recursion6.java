public class Recursion6 {
    public static int calPower(int x, int n) {
        if (n == 0) { // base case 1
            return 1;
        }
        if (x == 0) { // base case 2
            return 0;
        }
        int xpownm1 = calPower(x, n - 1);
        int xpown = x * xpownm1;
        return xpown;

    }

    public static void main(String args[]) {
        int x = 2, n = 5;
        System.out.println(calPower(x, n));

    }

}
