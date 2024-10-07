package PracticeProgram;

import java.util.Arrays;

public class SortingtheAray {
	
	/*public static void sort(int[] arr) {
		//int min=arr[0];
		int sortedArr[] = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
			int temp=0;
			if(arr[i]>arr[j]) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			
		}
			//System.out.print(arr[i]);
			//sortedArr[i]=arr[i];
		}
		
	}

	public static void main(String[] args) {
		int[] a= {6,5,1,3,2,4,16};
		//for(int i=0;i<a.length;i++) {
			//System.out.println("original "+Arrays.toString(a));
		sort(a);
		System.out.println(Arrays.toString(a));
		
	}*/
	
	 public static void main(String[] args){
	        int[] a = {84,66,57,83,104,1001};
	        sorting(a);
	        System.out.println("sorted arr: "+Arrays.toString(a));
	    }
	    public static void sorting(int[] arr){
	        
	        for(int i=0;i<arr.length;i++){
	            for(int j=i+1;j<arr.length;j++){
	                if(arr[i]>arr[j]){
	                    int temp;
	                    temp=arr[i];
	                    arr[i]=arr[j];
	                    arr[j]=temp;
	                }
	            }
	        }
	    }

}
