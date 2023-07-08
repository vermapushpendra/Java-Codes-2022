public class Occurance {
    public static int first = -1;
    public static int last = -1;

    public static void printOccurance(String str, int idx, char element) {
        if (idx == str.length()) {
            System.out.println(
                    first);
            System.out.println(last);
            return;

        }
        char currenChar = str.charAt(idx);
        if (currenChar == element) {
            if (first == -1) {
                first = idx;
            } else {
                last = idx;
            }
        }
        printOccurance(str, idx + 1, element);

    }

    public static void main(String args[]) {
        String str = "abaadaefaah";
        printOccurance(str, 0, "p");

    }

}
