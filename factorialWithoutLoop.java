import java.net.SocketTimeoutException;

public class factorialWithoutLoop {
    public static void main(String[] args) {
        int f = 1;
        int n = 5;
        switch (n) {
            case 5:
                f = 5;
            case 4:
                f = f * 4;
            case 3:
                f = f * 3;
            case 2:
                f = f * 2;
            case 1:
            case 0:
                f = f * 1;
                System.out.println("Factorial of " + n + " is: " + f);

        }

    }

}
