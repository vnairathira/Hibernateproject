package util;
import java.util.*;
class XworksEmp{
	int id;
	String name;
	int salary;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public XworksEmp(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "XworksEmp [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
}
class CompEx1 implements Comparator<XworksEmp>{

	@Override
	public int compare(XworksEmp x1, XworksEmp x2 ){

	
		return x1.id-x2.id;
		
	}	
}

class CompEx2 implements Comparator<XworksEmp>{
	public int compare(XworksEmp s1,XworksEmp s2) {
		
		return s1.name.compareTo(s2.name);
	}
}

public class Test {
public static void main(String[] args) {
	List<XworksEmp> list=new ArrayList<XworksEmp>();
	list.add(new XworksEmp(1,"athira",10456));
	list.add(new XworksEmp(5,"swathi",45697));
	list.add(new XworksEmp(8,"megha",10235));
	list.add(new XworksEmp(55,"chachu",48962));
	
	Collections.sort(list, new CompEx1() );
	list.forEach(System.out::println);
	System.out.println("***************************************************************");
	Collections.sort(list, new CompEx2());
	list.forEach(i->System.out.println(i));
	
	
	
	
	
}
}
