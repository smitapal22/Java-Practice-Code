package PracticeProgram;

import java.util.Arrays;
import java.util.HashMap;

public class Strgop {

	public static void main(String[] args) {
		String str="110011";
		HashMap<Character,Integer>map=new HashMap<Character,Integer>();
		for(int i=0;i<str.length();i++) {
		char c=str.charAt(i);
		if(!map.containsKey(c)) {
			map.put(c, 1);
		}else {
			map.put(c, map.get(c)+1);
		}
		}
		
		/*for(Character x:map.keySet()) {
			System.out.println("character: "+x+"occurence: "+map.get(x));*/
		//}
		
		
		String[] s =str.split("");
		Arrays.sort(s);
		System.out.println(Arrays.toString(s));
		String s1=String.join("", s);
		System.out.println(s1);
			}
		}
	


