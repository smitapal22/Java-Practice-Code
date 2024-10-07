package Recurssion;

import java.util.Scanner;

public class FibonacciNo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		int number=scanner.nextInt();
		fib(number);
	}
		
		public static void fib(int n) {
			
			int a =1;
			int b= 1;
			int count = 2;
				//int temp;
			while(count<=n) {
				 
					System.out.print(a+" ");
					int temp=b;
					b=b+a;
					a=temp;
					count++;
					
				}
				
			 //System.out.println(b);
			}
				
			 
	}


	


