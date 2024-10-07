package Programs;

public class F2F {

	public static void main(String[] args) {
		
		String str ="this is smita";
		char c= 't';
		//String[] str1 = str.split(str);
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(c==str.charAt(i)) {
				count++;
			}
		}
		System.out.println("count of char"+ count);
	}

}
