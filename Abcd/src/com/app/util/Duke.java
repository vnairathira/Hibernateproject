package com.app.util;

public class Duke extends Honda {
	public static void main(String[] args) {
		Duke d= new Duke();
		d.message();
		d.helo();
		//Bike b=new Bike();
	}

	@Override
	void helo() {
System.out.println("hiii");		
	}
}
