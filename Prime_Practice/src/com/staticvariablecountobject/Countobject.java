package com.staticvariablecountobject;

public class Countobject {
	
	static int count=0;
	
	Countobject(){
		count++;
	}
	
	public void displaycount() {
		System.out.println("Count: "+count);
	}
	
	

	public static void main(String[] args) {
		Countobject c=new Countobject();
		Countobject c1=new Countobject();
		Countobject c2=new Countobject();
		Countobject c3=new Countobject();
		Countobject c4=new Countobject();
		c4.displaycount();
		

	}

}
