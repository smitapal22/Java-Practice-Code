package PracticeProgram;

public class ReverseEachWordintheString {
	
	public static String reverseEachWord(String str){
		String[] words=str.split(" ");
		String originalString="";
		for(String word:words) {
			String reversedString="";
			for(int i=word.length()-1;i>=0;i--) {
				reversedString=reversedString+word.charAt(i);
			}
			originalString=originalString+reversedString+" ";
		}
		return originalString;
	}

	public static void main(String[] args) {
		String s="This is Niteesh";
		System.out.println("Reverse words in the String: "+reverseEachWord(s));

	}

}
