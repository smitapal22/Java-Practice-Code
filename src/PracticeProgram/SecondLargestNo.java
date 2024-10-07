package PracticeProgram;

import java.util.Arrays;

public class SecondLargestNo {

	public static void main(String[] args) {
		int[] a= {8,16,11,5,10,3};
		sL(a);
		System.out.println(Arrays.toString(a));
			System.out.println("Second Largest:"+a[1]);
	}
	public static void sL(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
			if(arr[i]>arr[j]) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
			//System.out.println("second Largest"+arr[1]);
		}
	}
	

}
