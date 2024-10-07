package Programs;

public class Student {
	String pName="karthik";
	String name;
	int rollno;
	int marks;
	Student(String name,int rollno,int marks) {
		this.name=name;
		this.rollno=rollno;
		this.marks=marks;
	}
	public void display() {
		System.out.println("name: "+name);
		System.out.println("rollno: "+rollno);
		System.out.println("marks: "+marks);
	}
	public static void main(String[] args) {
		Student student = new Student("smita",22,10);
		student.display();
		System.out.println(student.pName);
	}

}
