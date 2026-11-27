package com.finalclass;

final class Finalclass {
	
	int RollNo;
	String Name;
	String CollegeName;
	
	Finalclass(int rollno,String name,String collegename){
		this.RollNo=rollno;
		this.Name=name;
		this.CollegeName=collegename;
		
	}
	
	
	public void show() {
		System.out.println("********Student Details********");
		System.out.println("Rollno: "+RollNo);
		System.out.println("Name: "+Name);
		System.out.println("College Name: "+CollegeName);
	}

	public static void main(String[] args) {
		Finalclass fc=new Finalclass(111,"XYZ","SGGS");
		fc.show();

	}

}
