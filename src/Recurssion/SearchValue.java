package Recurssion;

public class SearchValue {

	public static void main(String[] args) {
		int arr[]= {1,23,13,45,56,87};
		int target=56;
		int ans = Search(arr, target);
		System.out.println(ans);
	}
	
	public static int Search(int[] arr, int target) {
	int s=0;
	int e=arr.length-1;
	
	while(s<=e) {
		int m=s+(e-s)/2;
		if(target<arr[m]) {
			e=m-1;
		}else if(target>arr[m]) {
			s=m+1;
		}else {
			return m;
		}
		
	}
	return -1;
	
}
	
}
