package java8;

import java.util.Arrays;
import java.util.List;

public class Tester {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,3,4);
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		for(int i:list) {
			System.out.println(i);
		}
		list.forEach(i -> System.out.println(i));
	}

}
