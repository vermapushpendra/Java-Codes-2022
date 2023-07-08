import java.util.*;
public class Recursion5Facbonacci {
    public static void printFibonacci(int a, int b,int n){
        if(n==0){
            return;
            
        }
        int c = a+b;
        System.out.println(c);
        printFibonacci(b, c, n-1);//a=b,b=c,n=n-1;

    }

    public static void main ( String args[]){
        System.out.println("Enter value of n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        n = n-2;
        int a=0 , b =1;
        System.out.println(a);
        System.out.println(b);
        printFibonacci(a, b, n);


    }
}
