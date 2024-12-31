package step01;

public class SyntaxTest {
	A getA() {
		return new A();
	}
	public static void main(String[] args) {
		SyntaxTest st = new SyntaxTest();
		A a = st.getA();
		System.out.println(a.name);
		a.name = "변경";
		System.out.println(a.name);
	}

}
