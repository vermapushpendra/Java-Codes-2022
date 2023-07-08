import java.util.HashSet;

public class UniqueSubsequences {
    public static void uniqueSubsequence(String str, int idx, String newString, HashSet<String> set) {
        if (idx == str.length()) {
            if (set.contains(newString)) {
                return;
            } else {
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char currChar = str.charAt(idx);
        // choose to be
        uniqueSubsequence(str, idx, newString + currChar, set);
        // or not choose to be
        uniqueSubsequence(str, idx, newString, set);

    }

    public static void main(String args[]) {
        String str = "abc";
        HashSet<String> set = new HashSet<>();
        uniqueSubsequence(str, 0, "", set);

    }

}
