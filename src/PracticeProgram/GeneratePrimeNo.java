package PracticeProgram;

public class GeneratePrimeNo {

	public static void main(String[] args) {
		int n=100;
		for(int j=1;j<=n;j++) {
//			prime(n);
			if(prime(j)) {
				System.out.println(j+ " numb is prime");
			}else{
				System.out.println(j+" numb is not prime");
			
		}
		}
	}
	public static boolean prime(int numb) {
		int c=0;
		for(int i=1;i<=numb;i++) {
			if(numb%i==0) {
				//return false;
				c++;
			}
		}
		//System.out.print(c);
		if(c==2) {
			//System.out.print(true);
			return true;
		}
		//System.out.print(false);
		return false;
	}
}
