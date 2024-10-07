package Programs;

public class Fact {

	public static void main(String[] args) {
		int numb = 6;
		int ans =factorial(numb);
		System.out.println("factorial:"+ans);
			}
	
	public static int factorial(int n) {
		
		int result =1;
		while(n>1) {
			//int result =1;
			result=result*n;
			n=n-1;
		}
		return result;
	}
	
}
