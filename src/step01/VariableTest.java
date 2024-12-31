package step01;

public class VariableTest {
	// 이름 변수
	String name = "김대연";
	
	// 나이 변수
	int age = 28;
	
	// 이름과 나이값을 출력하는 메소드
	public static void main(String[] args) {
		// 데이터 저장 - 변수에 값 저장
		
		
		// 출력 메소드 호출
		
		
		// 변수를 실제 사용 가능하게 메모리에 생성 = 객체 생성
		
		VariableTest v = new VariableTest();
		System.out.println(v.name);
		v.name = "김리영";
		System.out.println(v.name);
		// 순환참조가 생기지 않나요?
		
		
	}

}
