import java.util.*;

public class UpdateBit {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you Want to update 0 or 1");
        int number = sc.nextInt();
        int n = sc.nextInt();
        int pos = sc.nextInt();
        int bitmask = 1 << pos;

        if (number == 0) { // clear opeartion
            int not = ~bitmask;
            int newNumber = not & n;
            System.out.println(newNumber);
        } else { // set operation
            int newNumber = bitmask | n;
            System.out.println(newNumber);
        }

    }

}
