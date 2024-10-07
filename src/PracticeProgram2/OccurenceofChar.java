package PracticeProgram2;

public class OccurenceofChar {

	public static void main(String[] args) {
		String s= "This is Niteesh";
		System.out.println(occurence(s));

	}

	public static int occurence(String str) {
		char c='e';
		int count=0;
	 for(int i=0;i<str.length();i++) {
		 
		 if(str.charAt(i)==c) {
			 count++;
		 }
	 }
	 return count;
	}
}
