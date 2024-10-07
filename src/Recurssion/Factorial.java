package Recurssion;

public class Factorial {

	public static void main(String[] args) {
		int n=6;
		int ans = fac(n);
		System.out.println(ans);

	}
	
	public static int fac(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			
			fact=n*fac(n-1);
		}
		return fact;
				
	}

}

