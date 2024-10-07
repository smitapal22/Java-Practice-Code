package Programs;

public class IterNo {
	
	
	  	    public static int smallestNo(int arr[]){
	        int min= arr[0];
	        for(int i=1;i<arr.length-1;i++){
	            if(min>arr[i]){
	                min =arr[i];
	            }
	        }
	        return min;
	    }
	    
	    public static void main(String[] args) {
	        int[] a={4,2,7,5,3};
	        
	        System.out.println("smallest number:"+smallestNo(a));
	    }
	
	}


