import java.util.*;
public class VoteEligibility {
    public static void printEligibility(int age){
        if(age>18){
            System.out.println("You are eligible to vote");
            return;
        }
        else{
            System.out.println("You are not Eligible to vote");
            return;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        printEligibility(age);
    }
    
}
