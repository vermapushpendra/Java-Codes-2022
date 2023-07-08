public class Removeduplicates {
    public static boolean [] map = new boolean[26];

    public static void RemoveDuplicates(String str , int idx , String newString){
        if(idx==str.length()){
            System.out.println(newString);
            return;
        }
        char currentChar = str.charAt(idx);
        if(map[currentChar - 'a'] == true){
            RemoveDuplicates(str, idx+1, newString);
        }else{
            newString = newString+currentChar;
            map[currentChar-'a'] = true;
            RemoveDuplicates(str, idx+1, newString);
        }
    }
    public static void main(String args[]){
        String str = "abbccda";
        RemoveDuplicates(str, 0, "");

    }
    
}
