public class SwapTwoNumbersWithoutThirdVariable {
    public static void main(String args[])
    {
        int a = 10;
        int b = 30;
        b = a+b; //40

        a = b-a; // For a (40-10)
        b = b-a; //For b (40-30)
        System.out.println("a: "+ a );
        System.out.println("b: "+ b);
    }
    
}
