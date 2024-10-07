package Recurssion;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number");
		int number=scanner.nextInt();
		if(isPrime(number)) {
		System.out.println(number+" "+"is a prime number");
		}else {
			System.out.println(number+" "+"is not a prime number");
		}
	}
	public static boolean isPrime(int n) {
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
