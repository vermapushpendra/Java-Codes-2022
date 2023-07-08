import java.util.*;

public class Array {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int size = sc.nextInt();
        int numbers[] = new int[size];
        // input
        System.out.println("Enter numbers");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.println("enter value of x which you want to search in array index");
        int x = sc.nextInt();
        // output
        for (int i = 0; i < size; i++) {
            if (numbers[i] == x) {
                System.out.println("x found at: " + i);
            }
        }
    }

}
