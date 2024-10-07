package PracticeProgram;

public class OccurenceofStrin {

	public static int occurence(String str,char ch) {
		
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(ch==str.charAt(i)) {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		String s="occurences is six";
		char c='i';
		System.out.println("count of the character occurence: "+occurence(s,c));
	}

}
