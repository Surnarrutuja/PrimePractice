package com.staticinitialization;

public class StaticInitialization {
	
	static int RollNo;
	static String Name;
	static String CollegeName;
	
	static {
		RollNo=111;
		Name="XYZ";
		CollegeName="SGGS";
	}
	
	public void displayData() {
		System.out.println("********Student Details********");
		System.out.println("Rollno: "+RollNo);
		System.out.println("Name: "+Name);
		System.out.println("College Name: "+CollegeName);
	}

	public static void main(String[] args) {
		StaticInitialization si=new StaticInitialization();
		si.displayData();
	}

}
