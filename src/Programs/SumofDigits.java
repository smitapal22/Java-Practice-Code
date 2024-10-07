package Programs;

public class SumofDigits {

	public static void main(String[] args) {
		int number =78777;
		int ans = sumofDigits(number);
		System.out.println("sum of the digits of a number: "+ans);

	}
	public static int sumofDigits(int n) {
		int sum =0;
		while(n>0) {
			
			int reminder;
			reminder = n%10;
			sum=sum+reminder;
			n=n/10;
			
		}
		return sum;
		
	}

}
