package PracticeProgram2;

public class ReverseInteger {

	public static void main(String[] args) {
		int n=473829;
		System.out.println(reverseNumb(n));

	}
	public static int reverseNumb(int numb) {
		int reverse=0;
		while(numb>0) {
		int remainder =numb%10;
		reverse = reverse*10+remainder;
		numb=numb/10;
		}
		return reverse;
	}
}
