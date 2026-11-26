package com.staticmethod;

public class Staticmethod {
	
	int RollNo;
	String Name;
	
	static void display() {
		String Collegename="SGGS";
		System.out.println("College Name: "+Collegename);
	}
	
	public void displayData() {
		System.out.println("******Student Data*******");
		System.out.println("Student RollNo: "+RollNo);
		System.out.println("Student Name: "+Name);
		display();
	}

	public static void main(String[] args) {
		Staticmethod sm=new Staticmethod();
		sm.RollNo=11;
		sm.Name="xyz";
		sm.displayData();

	}

}
