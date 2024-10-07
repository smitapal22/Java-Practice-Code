package PracticeProgram2;

public class ReverseString {

	public static void main(String[] args) {
		String s= "This is Niteesh";
		System.out.println(reverseString(s));
	}
	
	public static String reverseString(String str) {
		
		String[] words = str.split(" ");
		String originalString ="";
		for(String word:words) {
			String reversed = "";
			for(int i=word.length()-1;i>=0;i--) {
				reversed=reversed+word.charAt(i);
			}
			originalString = originalString+reversed+" ";
		}
		return originalString;
	}

}
