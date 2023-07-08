public class GetBit {
    public static void main(String args[]) {
        int n = 5;// Decimal 5 in binary is 0101
        int pos = 3;
        int bitmask = 1 << pos;
        if ((bitmask & n) == 0) {
            System.out.println("Bit was zero");

        } else {
            System.out.println("Bit was one");
        }

    }

}
