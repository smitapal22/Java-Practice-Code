package PracticeProgram2;

public class FibSeries {

	public static void main(String[] args) {
		int n= 13;
		fib(n);
	}

	
	public static void fib(int numb) {
		int a=1;
		int b=1;
		int temp;
		for(int i=1;i<=numb;i++) {
			System.out.print(a+" ");
			temp=b;
			b=a+b;
			a=temp;
					
		}
	}
}
