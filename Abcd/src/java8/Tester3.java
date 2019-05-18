package java8;

interface A{
	public void method1(int i,int j);
}

public class Tester3 {

	public static void main(String[] args) {
//		A t= new A() {
//			public void method1() {
//				System.out.println("hi");
//			}
//		};
//		t.method1();
		
		A obj=(i,j) ->{System.out.println("hi");
		System.out.println("helloooo");
		};
		obj.method1(5,5);
	}

}
