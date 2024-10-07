package Recurssion;

public class SearchRandamValue {

	public static void main(String[] args) {
		int[] arr= {34,6,54,2,8,37};
		int target= 37;
		int ans = search(arr,target);
		System.out.println(ans);

	}

	public static int search(int[] arr,int target) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				return i;
			}
		}
		return -1;
	}
}
