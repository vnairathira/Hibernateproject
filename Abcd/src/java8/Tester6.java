package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

//class ConsumerImpl implements Consumer<Integer>{
//
//	@Override
//	public void accept(Integer i) {
//		System.out.println(i);
//		
//	}
//}

interface Helo{
void helo();		
}

public class Tester6 {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,4,5);
		 list.forEach(i-> System.out.println(i));
		 
		 Helo h= ()->System.out.println("hi..");
		 h.helo();
	}
}