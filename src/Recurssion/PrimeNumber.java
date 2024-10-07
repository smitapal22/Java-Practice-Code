package Recurssion;

public class PrimeNumber {

	public static void main(String[] args) {
	
		int n =20;
		for (int i=1;i<=n; i++)
		
		System.out.print(i +" "+isPrime(n));
	}
	
	public static boolean isPrime(int n) {
		if(n<=1){
			return false;
		}
		int c=2;
		while(c*c<=n) {
			if(n%2==0) {
				return false;
			}
			c++;
			if(c*c>n) {
				return true;
			}
			
		}
		return false;
	}
	

}
