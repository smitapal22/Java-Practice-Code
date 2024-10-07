package Recurssion;

public class Isfactorial {

	public static void main(String[] args) {
		int n = 6;
		System.out.println("factorial" +fact(n));
		
	}
public static int fact(int number) {
	
	while(number>0) {
		int fact=1;
		fact = number*fact(number-1);	
		return fact;
	}
	return -1;
}
}
