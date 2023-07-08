public class MoveXtoEnd {
    public static void xAtEnd(String str, int idx, int count, String newString){
        if(idx==str.length()){
            for(int i =0;i<count;i++){
                newString = newString + 'x';
            }
            System.out.println(newString);
        }
        char currenChar= str.charAt(idx);
        if(currenChar== 'x'){
            count++;
            xAtEnd(str, idx+1, count, newString);
        }
        else{
            newString += currenChar; //newString+currenChar
            xAtEnd(str, idx+1, count, newString);
        }

    }
    public static void main(String args[]){
        String str = "axbcxxd";
        xAtEnd(str, 0, 0, "");

    }
    
}
