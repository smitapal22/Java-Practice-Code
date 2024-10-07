package Recurssion;

public class SearchChar {

	public static void main(String[] args) {
		String name = "Kaneesha";
		char target = 'h';
		int Count=0;
		System.out.println(Search(name,target, Count));
	}
	
	static int Search(String str, char target, int Count) {
		
		if(str.length()==0) {
			return -1;
		}
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==target) {
				Count++;
				
			}
		}
		return Count;


	}

}
