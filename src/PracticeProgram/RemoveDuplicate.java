package PracticeProgram;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicate {

	public static void main(String[] args) {
		
		int[] a= {6,3,22,78,56,80,56};
		remove(a);
	}
	public static void remove(int[] arr) {
		HashSet<Integer>set=new HashSet<Integer>();
		for(Integer x:arr) {
			set.add(x);
		}
		Integer[] result= set.toArray(new Integer[0]);
		System.out.println(Arrays.toString(result));
	}
}
