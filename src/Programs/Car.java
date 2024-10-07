package Programs;


public class Car extends Student{
	String cName;
	int modelNo;
	int price;
	Car(String name,int rollno,int marks, String cName,int modelNo, int price ){
		super(name,rollno,marks);
	this.cName=cName;
	this.modelNo=modelNo;
	this.price=price;
	}
	public void display() {
		super.display();
		System.out.println("car name: "+cName);
		System.out.println("model name: "+modelNo);
		System.out.println("car price: "+price);
		System.out.println(super.pName);
	}
	public static void main(String[] args) {
        //Student student =new Student("Niteesh",22,90);
        Car car=new Car("Niteesh",22,90,"Innova",65768,500000);
        car.display();
	}

}
