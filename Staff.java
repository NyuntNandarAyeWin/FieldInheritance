package FieldInheritance;

public class Staff extends Person{

	String school;
	double pay;
	
	public Staff(String name, String address, String school, double pay) {
		super(name, address);
		this.school = school;
		this.pay = pay;
	}
	
	public String toString() {
		String str = "Staff Name : "+super.name+"\nStaff Address : "+super.address
				+"\nSchool Name : "+school+"\nPay : "+pay+"\n";
		return str;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Staff st1 = new Staff("U Hla", "Yangon", "Monywa University", 200000);
		Staff st2 = new Staff("Daw Muyar", "Monywa", "Computer University Monywa", 250000);
		
		System.out.println(st1.toString());
		System.out.println(st2.toString());
	}

}
