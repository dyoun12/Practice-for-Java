package step00.review;

class AA {
	String name = "aas456";
}
class BB {
	AA a = new AA();
}

public class Review3 {

	BB getBB() {
		return new BB();
	}
	
	int getLength(BB v) {
		return v.a.name.length();
	}
	
	public static void main(String[] args) {		
		Review3 r3 = new Review3();
		
		System.out.println(r3.getLength(r3.getBB()));
	}

}

