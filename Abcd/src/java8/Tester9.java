package java8;

interface I{
	String logic(String str);
}

class J{
	static String method(String s) {
		
		if(s.length()<=3)s=s.toUpperCase();
		else s=s.toLowerCase();
		return s;	
	}
}

class MyTester{
	void myTester(String str,I s) {
		str=s.logic(str);
		System.out.println(str);
	}
}

public class Tester9 {

	public static void main(String[] args) {
		MyTester ts=new MyTester();
		ts.myTester("Amma",J::method);
	}

}
