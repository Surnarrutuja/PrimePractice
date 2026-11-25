package com.defaultconstructor;

public class defaultconstructor {
	
	int Rollno;
	String name;
	int age;
	String address;
	
	
	public void display() {
		System.out.println("Student Details");
		System.out.println("Rollno:"+Rollno);
		System.out.println("name:"+name);
		System.out.println("age:"+age);
		System.out.println("address:"+address);
	}

	public static void main(String[] args) {
		defaultconstructor dc=new defaultconstructor();
		dc.Rollno=101;
		dc.name="Rutuja";
		dc.age=24;
		dc.address="Nanded";
		dc.display();

	}

}
