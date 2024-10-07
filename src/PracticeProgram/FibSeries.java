package PracticeProgram;

public class FibSeries {

	public static void main(String[] args) {
		int n=20;
		fib(n);

	}
	public static void fib(int numb) {
		int a =1;
		int b=1;
		int temp;
		for(int i=0;i<=numb;i++) {
			System.out.print(a+" ");
			temp=a+b;
			a=b;
			b=temp;
		}
	}

}
