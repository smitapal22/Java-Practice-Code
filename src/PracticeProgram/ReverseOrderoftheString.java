package PracticeProgram;

public class ReverseOrderoftheString {

	public static String reverseOrder(String str) {
		
		String[] words=str.split(" ");
		String reversedOrder="";
		for(int i=words.length-1;i>=0;i--) {
			reversedOrder=reversedOrder+words[i]+" ";
		}
		return reversedOrder;
	}
	public static void main(String[] args) {
		
		String s = "This is Niteesh";
		System.out.println("Reversed order: "+reverseOrder(s));

}
}
