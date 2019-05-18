package java8;

interface Inter{
	String inter(String str);
}
class Log{
	String log(String s) {
		if(s.length()<=3) s=s.toUpperCase();
		else s=s.toLowerCase();
		return s;
	}
}

class Tst{
	void test(String str,Inter in) {
		str=in.inter(str);
		System.out.println(str);
	}
}
public class Tester11 {

	public static void main(String[] args) {
		Tst obj=new Tst();
		Log lo=new Log();
		obj.test("Welcome to XworkZ",lo::log);

	}

}
