package com.staticvariable;

public class Staticvariable {
	
	int RollNo;
	String Name;
	static String CollegeName="SGGS";
	
	Staticvariable(int rollno,String name){
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
		Staticvariable sv=new Staticvariable(11,"XYZ");
		Staticvariable sv1=new Staticvariable(12,"ABC");
		sv.displayData();
		sv1.displayData();

	}

}
