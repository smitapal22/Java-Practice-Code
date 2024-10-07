package PracticeProgram2;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		int[] a= {101,67,1241,655,12,790,10};
		sortNumb(a);
		System.out.println(Arrays.toString(a));

	}
	
	public static void sortNumb(int[] arr) {
		
		Arrays.sort(arr);
		/*for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp;
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}*/
		
	}

}
