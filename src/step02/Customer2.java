package step02;

class AA{
	int age = 10;
}
public class Customer2 {		
	AA a = new AA();
	AA setA(AA a) {
		this.a = a;
		return a;
	}
	AA setA2(int no) {
		this.a.age = no;
		return a;
	}
	public static void main(String [] args) {
		Customer2 c = new Customer2();//name  멤버 변수만 생성
		int no = 100;
		AA a2 = c.setA2(200);
		System.out.println(a2.age);
		c.a.age = no;		
		System.out.println(a2.age);
	}
}
