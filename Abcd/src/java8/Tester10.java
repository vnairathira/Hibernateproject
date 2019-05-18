package java8;

interface Z{
	String z(String str);
}

class Y{
String y(String str) {
	if(str.length()<=3)str=str.toUpperCase();
	else str=str.toLowerCase();
	return str;
}
}
class X{
	void x(String s,Z z) {
		s=z.z(s);
		System.out.println(s);
	}
}

public class Tester10 {

	public static void main(String[] args) {
		X xx=new X();
		Y obj=new Y();
		xx.x("Hello HOW R U", obj::y);
	}

}
