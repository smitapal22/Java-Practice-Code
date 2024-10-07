package Programs;

public class ReverseNumber {

	public static void main(String[] args) {
		int number = 77896;
		int ans=reversedNumber(number);
		System.out.println("Reversed no of the given number: "+ans);
	}
	public static int reversedNumber(int n) {
		int reversedNumber=0;
		//int reversed = 0;
		while(n>0) {
			
			int reminder=n%10;
			reversedNumber= reversedNumber*10+reminder;
			n=n/10;
		}
		return reversedNumber;
	}

}
