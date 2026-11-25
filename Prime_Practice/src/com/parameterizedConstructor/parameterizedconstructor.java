package com.parameterizedConstructor;

public class parameterizedconstructor {
	
	int Rollno;
	String Name;
	int Age;
	String Address;
	String Collegename;
	
	parameterizedconstructor(int rollno,String name,int age,String address,String collegename){
		this.Rollno=rollno;
		this.Name=name;
		this.Age=age;
		this.Address=address;
		this.Collegename=collegename;
	}
	
	public void display() {
		System.out.println("***********Student Details***********");
		System.out.println("Rollno: "+Rollno);
		System.out.println("name: "+Name);
		System.out.println("age: "+Age);
		System.out.println("address: "+Address);
		System.out.println("College Name: "+Collegename);
	}

	public static void main(String[] args) {
		parameterizedconstructor pc=new parameterizedconstructor(101,"Rutu",24,"Nanded","SGGS");
		pc.display();

	}

}
