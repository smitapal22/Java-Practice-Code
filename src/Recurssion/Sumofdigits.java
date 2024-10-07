package Recurssion;

public class Sumofdigits {

	public static void main(String[] args) {
		int n = 9897;
		System.out.println("sum of the given digits of a number:"+ sumofDigits(n));

	}
	public static int sumofDigits(int number) {
		int sum = 0;
		while(number>0) {
			
			int reminder;
			 reminder= number%10;
			sum=sum+reminder;
			number=number/10;
		}
		return sum;
				
	}
	
}
