package Programs;

public class PrimeNo {

	public static void main(String[] args) {
	int number= 18;
	if(Prime(number)) {
		System.out.println(number+ "the given number is a prime number: ");
	}else {
		System.out.println(number+ "the given number is not a prime number: ");
	}

	}
	public static boolean Prime(int n) {
		if(n<=0) {
			return false;
		}
		if(n>1) {
			for(int i=2;i<n/2;i++) {
				if(n%i==0) {
					return false;
				}
									
			}
		} 
		return true;
	}
	

}
