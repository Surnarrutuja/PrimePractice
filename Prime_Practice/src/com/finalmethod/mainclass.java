package com.finalmethod;

public class mainclass extends methods{
	
	
//	Final method can not override
	
	@Override
	public void show1() {
		System.out.println("Overrided MEthod");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		mainclass m=new mainclass();
		m.show();
		m.show1();
		
	}

}
