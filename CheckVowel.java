public class CheckVowel {
    public static void main (String args[])
    {
        String s = "Pushpendra";
        int count = 0;
        for(int i =0; i<s.length(); i++)
        {
            char j = s.charAt(i);
            if((j=='a') || (j =='e') ||(j=='i') ||(j=='o') ||(j=='u') || (j=='A') || (j =='E') ||(j=='I') ||(j=='O') ||(j=='U'))
            {
                count = count +1;
            }
        }
        System.out.println(count);
    }
    
}
