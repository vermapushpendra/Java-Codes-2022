import java.util.*;
public class StringsBuilder {
public static void main(String args[]){
    StringBuilder sb = new StringBuilder("Pushpendr");
    System.out.println(sb);
    // append in string builder(add char. in last)
    sb.append("a");
    sb.append(" ");
    sb.append("V");
    sb.append("e");
    sb.append("r");
    sb.append("m");
    sb.append("a");
    System.out.println(sb);
    System.out.println(sb.length());//to print lenght
/*
//char at index 0
System.out.println(sb.charAt(0));

//set char at index 0
sb.setCharAt(0, 'p');
System.out.println(sb);

//insert
sb.insert(9, 'a');
System.out.println(sb);

//delete character
sb.delete(9, 10);
System.out.println(sb);*/

}
}
