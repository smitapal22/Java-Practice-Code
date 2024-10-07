package Programs;

public class SwapNumber {

	public static void main(String[] args) {
		int firstNumber= 2;
		int secondNumber= 4;
		swap(firstNumber,secondNumber);
	}
	public static void swap(int a, int b) {
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("Value of a:"+a+" "+"Value of b:"+b);
	}
	
}
