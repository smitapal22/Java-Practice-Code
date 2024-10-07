package PracticeProgram;

import java.util.HashMap;

public class OccurenceInArray {

	public static void main(String[] args) {
		int[] a={2,4,5,6,87,12,5};
        occurence(a);

	}
	public static void occurence(int[] arr){
	    HashMap<Integer,Integer> map = new HashMap<>();
	   // int count=0;
	        for(Integer x:arr){
	            if(!map.containsKey(x)){
	                map.put(x,1);
	            }else{
	                map.put(x,map.get(x)+1);
	            }
	        }
	        for(Integer x:map.keySet()){
	            
	            if(map.get(x)>1){
	            	System.out.println(x+":"+map.get(x));
	            }
	           

}

	}
	}
