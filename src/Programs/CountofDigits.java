package Programs;

public class CountofDigits {

	public static void main(String[] args) {
		int number = 34556576;
		int ans=countofDigits(number);
		System.out.println("Count of the digits of the given number: "+ans);

	}
	
	public static int countofDigits(int n) {
		int count =0;
	while(n!=0) {
		int reminder=n%10;
		count++;
		n=n/10;
	}
		return count;
	}
}
