package com.staticInstancevar;

public class StaticInstancevariable {
	
	int RollNo;
	String Name;
	static String CollegeName="SGGS";
	
	StaticInstancevariable(int rollno,String name){
		this.RollNo=rollno;
		this.Name=name;
	}
	
	public void displayData() {
		System.out.println("*********Student Data********");
		System.out.println("Student Roll No: "+RollNo);
		System.out.println("Student Name: "+Name);
		System.out.println("College Name: "+CollegeName);
	}

	public static void main(String[] args) {
		StaticInstancevariable sv=new StaticInstancevariable(11,"XYZ");
		StaticInstancevariable sv1=new StaticInstancevariable(12,"ABC");
		sv.displayData();
		CollegeName="Gramin";
		sv1.displayData();

	}

}
