package Programs;

public class ChildClass extends ParentClass1{

	
	//public ChildClass(int a,int b) {
		
	public ChildClass(int a, int b) {
		super(a, b);
		// TODO Auto-generated constructor stub
	}

	
	public void sub() {
		super.sub(a,b);
		
	}
	
	public void sum() {
		int result = a+b;
		System.out.println("Child class method sum: "+result);
	}

	public static void main(String[] args) {
		ChildClass child = new ChildClass(30,10);
		child.sub();
		child.sum();
		sub(10,40);
		sum(20,30);
	}
	

}
