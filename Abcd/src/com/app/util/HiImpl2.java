package com.app.util;

public class HiImpl2  extends HiImpl{

	public static void main(String[] args) {
		HiImpl2 h=new HiImpl2();
		h.message();
		h.msg();
		h.print();
	}

	@Override
	public void print() {
System.out.println("print");		
	}

}
