package util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Su implements Comparable<Su>{
	int id;
	String name;
	int mark;
	public Su(int id, String name, int mark) {
		super();
		this.id = id;
		this.name = name;
		this.mark = mark;
	}
	@Override
	public String toString() {
		return "Su [id=" + id + ", name=" + name + ", mark=" + mark + "]";
	}	
	@Override
	public int compareTo(Su s) {
		return this.mark-s.mark;
	}
	
}
public class Student {	
	public static void main(String[] args) {
	List<Su> list=new ArrayList<Su>();	
	list.add(new Su(8,"mahathi",458));
	list.add(new Su(4,"gomathi",500));
	list.add(new Su(9,"chabhu",369));
	list.add(new Su(2,"ammini",456));
	Collections.sort(list);
	list.forEach(System.out::println);
	}
}
