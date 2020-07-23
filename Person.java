package FieldInheritance;

public class Person {
	String name;
	String address;
	
	public Person(String name, String address) {
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public String toStrin() {
		String str ="Your Name : "+getName()+"\nYour Address : "+getAddress();
		return str;
	}
	
}
