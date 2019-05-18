package java8;

import java.util.Arrays;
import java.util.List;

interface AB{
	void msg();
	
}

public class Tester7 {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,3,4,5);
	//	list.forEach(i->System.out.println(i));
		list.forEach(System.out::println);
		
		List<String> values=Arrays.asList("hi","athira","v","nair");
		values.forEach(i->System.out.print(i+"\t"));
		System.out.println();
		
		AB a=()->System.out.println("Hi");
		a.msg();
	}

}
