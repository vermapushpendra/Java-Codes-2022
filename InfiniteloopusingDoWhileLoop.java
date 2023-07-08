import java.util.*;

public class InfiniteloopusingDoWhileLoop {

    public static void printInfiniteLoop(int n) {
        int i = n;
        do { // It's a Infinite loop so that's why it's commnet out.
            System.out.println(i);
            i++;
        } while (i > 1);
        return;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printInfiniteLoop(n);

    }
}
