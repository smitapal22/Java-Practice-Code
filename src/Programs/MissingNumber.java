package Programs;

public class MissingNumber {

	public static void main(String[] args) {
		int[] a= {4,3,0,1};
		missedNumb(a);
	}
	
	public static void missedNumb(int[] arr) {
		int i=0;
		while(i<arr.length) {
			int correct = arr[i];
			if(arr[i]<arr.length && arr[i]==arr[correct]) {
				swap(arr,correct,i);
			}
			i++;
		}
	}
	
	public static void swap(int[] arr,int correct,int i) {
		for(int j=0;j<arr.length;j++) {
			int temp;
			temp=arr[j];
			arr[j]=arr[correct];
			arr[correct]=temp;
			
		}
	}

}
