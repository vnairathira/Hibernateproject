package java8;

import java.util.Arrays;
import java.util.List;

public class Tester4 {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,3,4,7);
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println("**************************************");
		
		for(int i:list) {
			System.out.println(i);
		}
		System.out.println("**************************************");
		
		list.forEach(i ->System.out.println(i));
	}

}
