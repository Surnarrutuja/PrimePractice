package com.excutionodorder;

public class Blocksconstructor {
	
	 int RollNo;
	 String Name;
	 static String CollegeName;
	 
	 static{
		 CollegeName="SGGS";
		 System.out.println("Static Block");
	 }
	
	{
		RollNo=111;
		Name="XYZ";
		System.out.println("Non static Block");
		
	}
	
	Blocksconstructor(){
		System.out.println("Constructor");
	}
	
	public void displayData() {
		System.out.println("Method Block");
		System.out.println("********Student Details********");
		System.out.println("Rollno: "+RollNo);
		System.out.println("Name: "+Name);
		System.out.println("College Name: "+CollegeName);
	}

	public static void main(String[] args) {
		Blocksconstructor bc=new Blocksconstructor();
		bc.displayData();

	}

}
