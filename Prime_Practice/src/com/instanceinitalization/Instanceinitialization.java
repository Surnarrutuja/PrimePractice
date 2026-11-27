package com.instanceinitalization;

public class Instanceinitialization {
	
	 int RollNo;
	 String Name;
	 String CollegeName;
	
	{
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
		Instanceinitialization i=new Instanceinitialization();
		i.displayData();

	}

}
