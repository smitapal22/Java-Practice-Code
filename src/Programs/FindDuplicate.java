package Programs;

import java.util.HashMap;

public class FindDuplicate {

	public static void main(String[] args) {
		int[] arr = {2,6,4,5,4,9,2};
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int x:arr) {
			if(!map.containsKey(x)) {
				map.put(x, 1);
			}else {
				map.put(x, map.get(x)+1);
			}
		}
		for(Integer x:map.keySet()) {
			
			if(map.get(x)>1) {
				System.out.println(x);
			}
		

	}
		
	}
}
