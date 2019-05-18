package util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable<Employee>{
	int id;
	String name;
	int salary;
	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	
	@Override
	public int compareTo(Employee e) {
		
		return this.salary-e.salary;
	}
	public String toString() {
		return "[id="+this.id+"], [name="+this.name+"],[salary="+this.salary+"],";
	}
	
}

public class Emp {
public static void main(String[] args) {
	List<Employee> list=new ArrayList<Employee>();
	list.add(new Employee(101,"anu",145623));
	list.add(new Employee(105,"janu",456891));
	list.add(new Employee(103,"manu",987456));
	list.add(new Employee(104,"mohan",598454));
	Collections.sort(list);
	list.forEach(System.out::println);
	
}
}
