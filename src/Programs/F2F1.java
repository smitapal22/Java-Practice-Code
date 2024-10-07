package Programs;

import java.util.HashMap;

public class F2F1 {

	public static void main(String[] args) {
		
		String str="smita is";
		//Character f='i';
		char[] x=str.toCharArray();
		System.out.println(x);
		System.out.println();
		HashMap<Character,Integer>map= new HashMap<>();
		for(Character c:x) {
			if(!map.containsKey(c)) {
				map.put(c, 1);
			}else {
				map.put(c,map.get(c)+1);
			}
				
		}
		for(Character c:map.keySet()) {
			System.out.println(c+" is: "+map.get(c));
		}
	}

}
