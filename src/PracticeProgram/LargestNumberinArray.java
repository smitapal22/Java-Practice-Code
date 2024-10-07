package PracticeProgram;

import java.util.Arrays;

public class LargestNumberinArray {

	public static void main(String[] args){
        int[] a={23,87,1000,36,75,47};
      //  large(a);
        System.out.println(large(a));
      // System.out.println(Arrays.toString(a));
    }
  public static int large(int[] arr){
      int max=arr[0];
      for(int i=1;i<arr.length;i++){
    	 // System.out.println(arr.length);
          if(arr[i]>max){
              max=arr[i];
          }
      }
      return max;
  }
}
