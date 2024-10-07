package Programs;

public class CountDigits {

	public static void main(String[] args) {
		long numb=87987667675L;
		int ans = countD(numb);
		System.out.println("count of digit of given number:" +countD(numb));
	}
	
	public static int countD(long n) {
		
		long remainder;
		int count=0;
		while(n>0) {
			
			remainder =n%10;
			count++;
			n=n/10;
		}
		return count;
	}

}
