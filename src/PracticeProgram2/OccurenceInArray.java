package PracticeProgram2;

import java.util.HashMap;

public class OccurenceInArray {

	public static void main(String[] args) {
		int[] a= {45,80,101,20,7,98,1001,7};
		occurence(a);
	}

	public static void occurence(int[] arr) {
		HashMap<Integer, Integer>map= new HashMap<>();
		for(Integer x:arr) {
		if(!map.containsKey(x)) {
			map.put(x, 1);
		}else {
			map.put(x, map.get(x)+1);
		}
		
		}
		
		for(Integer c:map.keySet()) {
			//if(map.get(c)>1) {
				System.out.println(c+":"+map.get(c));
			//}
			
		}
	}
}
