import java.util.*;

public class ArrayName {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String names[] = new String[size];

        // input
        for (int i = 0; i < size; i++) {
            names[i] = sc.next();
        }
        // ouput
        for (int i = 0; i < size; i++) {
            System.out.println(names[i]);
        }
    }

}
