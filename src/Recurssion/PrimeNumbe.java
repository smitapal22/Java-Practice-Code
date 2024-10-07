package Recurssion;

public class PrimeNumbe {
	public static void main(String[] args) {
		
		int n =11;
		for (int i=1;i<=n; i++) {
		if(isPrime(i));
		System.out.println(i+" "+isPrime(i));
		}
		//if(isPrime(n)) {
		//System.out.println(n+" "+"is prime Number:"+isPrime(n));
		//}else {
	//	System.out.println(n+" "+"is not prime Number:"+isPrime(n));
		//}
	}
	
	public static boolean isPrime(int number) {
	if(number<=1) {
		return false;
	}
	int c=2;
	while(c*c<=number) {
		if(number%c==0) {
			return false;
		}
		c++;
	}
		return true;
	}
}