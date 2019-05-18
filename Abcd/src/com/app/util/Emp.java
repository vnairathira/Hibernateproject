package com.app.util;

public class Emp {
	int id;
	String name;
	Adress adress;
	
public Emp(int id, String name, Adress adress) {
		super();
		this.id = id;
		this.name = name;
		this.adress = adress;
	}
private void syso() {
System.out.println(id+name);
System.out.println(adress.city+adress.state+adress.pin);
}

public static void main(String[] args) {
	Adress adress	=new Adress("pala\t","kerala\t","655532");
	Emp emp=new Emp(10,"\tathira\t",adress);
	emp.syso();
	
}
}
