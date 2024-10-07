package Programs;

import java.util.Scanner;

public class FibNo {

	public static void main(String[] args) {
		//Scanner scanner = new Scanner(System.in);
		//System.out.println("Enter the number");
		//int number=scanner.nextInt();
		//int number= 20;
	//	fibNO(number);
		
	//1 1 2 3 5 8 13
	//public static void fibNO(int n) {
		int a=1;
		int b=1;
		int temp;
		int n =10;
		//int count=2;
		for(int i=2;i<=n;i++) {
		
			System.out.print(a+" ");
			temp=b;
			b=a+b;
			a=temp;
		
		}
		//System.out.print(b);
	}

}
