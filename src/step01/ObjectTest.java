/* 하나의 *.java에 다수의 클래스 개발 가능
 * 단 byte class 파일은 개별적으로 생성
 * 
 * *.java 구조(암기)
 * 1. package  선언구
 * 2. class 선언구
 * 3. 클래스 내부 구현 가능한 요소
 * 		- 변수(데이터, 옵션), 생성자(객체생성기능, 필수), 메소드(기능, 옵션)
 * 4. 생성자(필수)
 * 	- 모든 클래스에 필수
 *  - 개발자가 개발하지 않아도 자동 생성(기본 생성자)
 *  - 문법 : 클래스명과 100%동일, 반환타입 자체가 존재하지 않음
 *  
 * 객체 생성 
 * - 보유한 변수들을 메모리 생성
 * - int타입의 경우 32bit 메모리 확보, 값을 저장
 * - String 타입의 문자열 저장 가능한 메모리 확보 및 값 저장
 * - A 타입의 경우 A객체 생성
 */
package step01;

class A{
	String name = "김혜경";
	A(){
		System.out.println("A 생성자");
	}	
}
class B{
	B(){
		System.out.println("B 생성자");
	}
	A a = new A();
}
class C{
	C(){
		System.out.println("C 생성자");
	}
	B b = new B();
}

public class ObjectTest {

	public static void main(String[] args) {		
		C c = new C();//객체 생성 순서와 name변수 호출 ???
		System.out.println(c.b.a.name);
	}

}
