public class StringReversebyRecursion {
    public static void printReverse(String str, int index) {
        if(index==0){
            System.out.println(str.charAt(index));
        }
        System.out.print(str.charAt(index));
        printReverse(str, index-1);
        
    }
    public static void main(String args[]){
        String str = "dcba";
        printReverse(str, str.length()-1);
    }
    
}
