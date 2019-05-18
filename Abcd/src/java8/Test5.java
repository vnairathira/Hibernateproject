package java8;

interface B{
	void method(int i);
	//void helo();
}

//class C implements B{
//	public void method() {
//		
//	}
//	
//}

public class Test5 {

	public static void main(String[] args) {
//		B obj=new B() {
//			public void method() {
//				System.out.println("hi.....Annonimous classs...");
//			}
//		};
//		
//		obj.method();
		
		B obj =(i) -> {
				System.out.println("hiii.. lamda Exprssn "+i);
				
		};obj.method(5);
		
	}

}
