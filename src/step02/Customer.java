package step02;

public class Customer {
	String name = "유재석";

	// 데이터 제공
	public String getName() {
		return name;
	}

	// 데이터 수정
	public void setName(String name) {
		this.name = name;
		System.out.println(this);
	}
	
	public static void main(String [] args) {
		Customer c = new Customer();
		System.out.println(c.getName());
	}
}
