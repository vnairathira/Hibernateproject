package java8;

import java.util.Arrays;
import java.util.List;

public class Tester1 {

	public static void main(String[] args) {
		List<Integer> values=Arrays.asList(1,5,6,7,8,9,4);
//		for(int i=0;i<values.size();i++) {
//			System.out.println(values.get(i));
//		}
		
		/*
		 * for(int i:values) { System.out.println(i); }
		 */		
		values.forEach(i ->System.out.println(i));

	}

}
