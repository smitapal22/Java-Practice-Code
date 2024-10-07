package PracticeProgram;

public class SearchElementinArray {
	
	/*public static void search(int[] arr,int target) {
		for(int i=0;i<arr.length;i++) {
			if(target==arr[i]) {
				System.out.println(i);
			}
			
		}
		
	}*/
	
	/*public static void main(String[] args){
        int[] a={2,6,9,7,1,21};
       System.out.println(searchNo(a));
    }*/
    public static int searchNo(int[] arr){
        int target=21;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target);
            return i;
        }
        return -1;
            }

	public static void main(String[] args) {
		int[] a= {1,5,7,9,4,8};
		//int t=8;
		System.out.println(searchNo(a));
	}

}
