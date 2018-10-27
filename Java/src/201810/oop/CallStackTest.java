package oop;

public class CallStackTest {

	public static void main(String[] args) {
		firstMethod(); // 클래스 메소드는 (static method)객체 생성 없이 호출 가능.
	}
	
	static void firstMethod() {
		secondMethod(); 
	}
	
	static void secondMethod() {
		System.out.println("secondMethod()");
	}

}
