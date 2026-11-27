package com.allblocks;

public class AllBlocks {
	
	int RollNo;
	String Name;
	final int Collegeid=360;
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
	
	AllBlocks(){
		System.out.println("Constructor");
	}
	
	public void displayData() {
		System.out.println("Method Block");
		System.out.println("********Student Details********");
		System.out.println("Rollno: "+RollNo);
		System.out.println("Name: "+Name);
		System.out.println("College ID: "+Collegeid);
		System.out.println("College Name: "+CollegeName);
	}

	public static void main(String[] args) {
		AllBlocks all=new AllBlocks();
		all.displayData();

	}

}
