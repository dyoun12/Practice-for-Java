/* 메소드 학습
 * 1. 용도
 * 	- 기능 구현 및 활용
 * 2. 기능
 * - 새로운 값을 받아서 활용 및 처리
 * - 데이터값을 가공 후 반환(return)
 * 3. 문법
 * 	1. 반환타입 메소드명(){}
 * 	2. () 
 * 		- 새로운 데이터 받는 문법
 * 		- parameter(주고 받는 것들) / argument
 * 	3. {} - 기능 구현 영역(반환값도 처리) 
 * 
 * 4. 생성자와 비교
 * 	- 생성자 - 반환타입 문법 자체가 미존재
 *  - 메소드 - 반환타입 문법 필수  
 */
package step01;

public class MethodTest {
	A a = new A();
	int i = 20;
	String s = "ee";
	
	A getA() {
		return new A();
	}
		
	//이름(String)을 반환하는 메소드
	String getName(){
		return "ee";//호출한 곳으로 문자열 반환 코드 
	}
	
	//두개의 수치값 받아서 더한 후에 반환하는 메소드
	int sum(int v1, int v2){
		return v1 + v2;
	}
	
	//단순 이름 출력 메소드(반환값 없음)
	void printName() {
		System.out.println("구민지");
	}
	public static void main(String[] args) {
		
	}

}
