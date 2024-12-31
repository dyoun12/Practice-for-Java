package step00.review;


class A {
	String name = "aas";
}
class B {
	A a = new A();
}
public class Review2 {

	public static void main(String[] args) {
		B b = new B();
		System.out.println(b.a.name.length());
		
		
	}

}
