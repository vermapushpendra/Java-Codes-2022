import java.util.*;
public class Recursion4 {public static int printFactorial(int n){
    if(n==1 | n==0){
        return 1;
    }
    int fact_nm1=printFactorial(n-1);
    int fact_n=n*fact_nm1;
    return fact_n;

}

public static void main(String args[]){
    System.out.println("Enter value of n: ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int ans = printFactorial(n);
    System.out.println(ans);//System.out.println(printFactorial(n));


}
    
}
