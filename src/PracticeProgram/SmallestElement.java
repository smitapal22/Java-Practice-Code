package PracticeProgram;

public class SmallestElement {
	public static int min(int[] arr) {
		int min=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		return min;
	}

	public static void main(String[] args) {
		int[] a = {84,66,57,83,104,1001};
		System.out.println(min(a));
	}

}
