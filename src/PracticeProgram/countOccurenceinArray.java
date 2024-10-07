package PracticeProgram;

import java.util.HashMap;

public class countOccurenceinArray {

	public static void occurence(int[] arr) {
		HashMap<Integer,Integer>map = new HashMap<>();
		for(Integer x:arr) {
		if(map.containsKey(x)) {
			map.put(x,map.get(x)+1);
		}else {
			map.put(x, 1);
		}
	
	}
		for(Integer c:map.keySet()) {
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int[] a= {2,43,1,22,1,22};
		occurence(a);

	}

}
