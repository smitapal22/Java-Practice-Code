package Programs;

public class ParentClass1 {
	
	int a;
	int b;
	public ParentClass1(int a,int b) {
		this.a=a;
		this.b=b;
	}
	public static void sum(int a,int b) {
		
		int result1 = a+b;
		System.out.println("parent class method add "+result1);
	}

	public static void sub(int a,int b) {
		int result2 = a-b;
		System.out.println("parent class method sub "+result2);

	}
	public static void main(String[] args) {
		sum(40,50);
		sub(30,10);
	}

}
