package Programs;

import java.util.Arrays;
import java.util.List;

public class OccurenceofChar {

	public static void main(String[] args) {
		
		int count=0;
		String line="smita is sweeet";
		String[] words = line.split(" ");
		
		//char[] ch= line.toCharArray();
		List<String> list = Arrays.asList(words);
		System.out.println(list);
		char target='e';
		for(String word:words) {
			for(int i=0;i<word.length();i++) {
			if(word.charAt(i)==target){
				count++;
				}
			}
			
		}
		System.out.println(count);
	}
}
