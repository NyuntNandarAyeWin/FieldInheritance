package FieldInheritance;

public class Student extends Person{

	String program;
	int year;
	double fee;
	
	public Student(String name, String address, String program, int year, double fee) {
		super(name, address);
		this.program = program;
		this.year = year;
		this.fee = fee;
	}
	
	public void display() {
		System.out.println(super.toStrin());
		System.out.println("Student Program : "+program);
		System.out.println("Year : "+year);
		System.out.println("Fee : "+fee);
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu1 = new Student("Nandar", "Monywa","Development Program", 2016, 200000.0);
		Student stu2 = new Student("De Zin", "Monywa","Development Program", 2016, 200000.0);
		Student stu3 = new Student("Tun Tun", "Mandalay","Foundation Program", 2017, 100000.0);
		
		stu1.display();
		stu2.display();
		stu3.display();
		
	}

}
