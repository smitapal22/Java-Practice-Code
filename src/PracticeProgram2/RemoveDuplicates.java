package PracticeProgram2;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int[] a= {45,80,101,20,7,98,1001,7,98};
		removedup(a);
	}

	
	public static void removedup(int[] arr) {
		HashSet<Integer>set = new HashSet<>();
		for(Integer x:arr) {
		set.add(x);
		}
		Integer[] result=set.toArray(new Integer[set.size()]);
		System.out.println(Arrays.toString(result));
	}
}
