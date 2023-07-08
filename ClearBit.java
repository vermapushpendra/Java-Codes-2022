public class ClearBit {
    public static void main(String args[]) {
        int n = 5 ; // 0101
        int pos = 2;
        int bitmask = 1 << pos;
        int not = ~(bitmask);
        int newNumber = not & n;
        System.out.println(newNumber);

    }

}
