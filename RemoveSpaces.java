
public class RemoveSpaces {



  public static Void main (String[]args)
  {
    Scanner scanner = new Scanner (System.in);
    String sentence = scanner.nextLine ();
    String noSpaces = sentence.replaceAll ("\\s", "");
      System.out.println (noSpaces);
   }
}


