package step00.review;

class People {
	String name;
	int age;
	
	People(){}
	
	String getName() {
		return name;
	}
	
	int getNameLength() {
		int l = name.length();
		return l;
	}
	
	//age 변수값 수정 메소드
	void setAge(int age) {
		this.age = age;
	}
}

public class Review1 {
	public static void main(String[] args) {
		People p = new People();
		p.name = "fisa맨";
		String name = p.name;
		System.out.println(name);
		System.out.println(p.getName());
		
		int v2 = p.getNameLength();
		System.out.println(v2);
		
		
		p.setAge(12);
		
		System.out.println(p.age);
	}
}
