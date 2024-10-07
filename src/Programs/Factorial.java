package Programs;

public class Factorial {

	public static void main(String[] args) {
		int number=5;
		int ans=fact(number);
		System.out.println("Factorial of given number is: "+ans);

	}
	
	public static int fact(int n) {
		if(n>1) {
			int fact=1;
			for(int i=0;i<n;i++) {
			fact=fact*(n-i);
			
			}
			return fact;
		}
	
	return -1;
}
}
