package com.finalvariable;

public class Finalvariable {
	int RollNo;
	String name;
	final String CollegeName="SGGS";
	
	public void show() {
		System.out.println("********Student Details********");
		System.out.println("Rollno: "+RollNo);
		System.out.println("Name: "+name);
		System.out.println("College Name: "+CollegeName);
	}
	
	
	public static void main(String[] args) {
		Finalvariable fv=new Finalvariable();
		fv.RollNo=111;
		fv.name="xyz";
		fv.show();
		Finalvariable fv1=new Finalvariable();
		fv1.RollNo=112;
		fv1.name="ABC";
		fv1.show();
	}

}
