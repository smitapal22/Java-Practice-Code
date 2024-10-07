package PracticeProgram2;

public class PrimeNo {

	public static void main(String[] args) {
	
	int n=14;
	for(int j=0;j<=n;j++) {
	if(isPrime(j)) {
		System.out.println("the given no "+j+" is prime number");
	}else {
		System.out.println("the given no "+j+" is not prime number");
	}

	}
	}
	public static boolean isPrime(int numb) {
		
		for(int i=2;i<=numb/2;i++) {
			if(numb%i==0) {
				return false;
			}
			
		}
		return true;
	}

}
