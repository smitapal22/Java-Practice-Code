package PracticeProgram2;

public class ReverseaWord {

	public static void main(String[] args) {
		String s= "Smita";
		System.out.println(reverseWord(s));
	}

	public static String reverseWord(String str) {
		String reversedWord = "";
		for(int i=str.length()-1;i>=0;i--) {
			reversedWord = reversedWord+str.charAt(i);
		}
		return reversedWord;
	}
}
