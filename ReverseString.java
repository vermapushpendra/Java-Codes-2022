public class ReverseString
{
	public static void main(String[] args) {
		String name = "PNAMAN";
		String rev  = "";
		int n = name.length();
		
		for(int i = n-1; i>=0;i--){
		    rev = rev + name.charAt(i);
		}
		System.out.println(rev);
	}
}