import java.util.*;
public class circumferenceofcircle {
    public static Double getCircumference(Double r){
        Double circumference = 2*3.14*r;
        return circumference;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Double r = sc.nextDouble();
        System.out.println(getCircumference(r));
    }
    
}
