import java.util.*;

public class calculator {
    public static void main(String[] args) {
        double num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers");
        num1 = sc.nextDouble();
        num2 = sc.nextDouble();
        System.out.println("Enter operators");
        char op = sc.next().charAt(0);

        switch (op) {
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            case '/':
                System.out.println(num1 / num2);
                break;

            default: System.out.println("Invalid Input");
                break;
        }
    }

}
