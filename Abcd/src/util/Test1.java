package util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class StudentExample{
	int id;
	String name;
	int salary;
	public StudentExample(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}	
}
class CompExample1 implements Comparator<StudentExample>{
	@Override
	public int compare(StudentExample o1, StudentExample o2) {
		
		return o1.salary-o2.salary;
	}
}
class CompExample implements Comparator<StudentExample>{

	@Override
	public int compare(StudentExample o1, StudentExample o2) {
		return o1.name.compareTo(o2.name);
	}
	
}

public class Test1 {

	public static void main(String[] args) {
		List<StudentExample> list=new ArrayList<StudentExample>();
		list.add(new StudentExample(1, "sadhana",10235));
		list.add(new StudentExample(5, "mohammad",45689));
		list.add(new StudentExample(8, "chokkalingam",48965));
		list.add(new StudentExample(13, "sushama",489756));
		
		Collections.sort(list,new CompExample1());
		for(StudentExample i:list) {
			System.out.println(i);
		}
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		Collections.sort(list,new CompExample());
		list.forEach(System.out::println);
	}

}
