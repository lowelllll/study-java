package oop;

class MyMath{
	long a,b; // 인스턴스 변수
	
	// 인스턴스 메서드
	long add() {
		return a + b ;
	} 
	
	long sub() {
		return a - b;
	}
	
	long mul( ) {
		return a * b;
	}
	
	long div() {
		return a / b;
	}
	
	// 클래스 메서드
	static long add(long a, long b) { return a+b;}
	static long sub(long a, long b) { return a-b;}
	static long mul(long a, long b) { return a*b;}
	static long div(long a, long b) { return a/b;}
}
public class MyMathTest {
	public static void main(String[] args) {
		// 클래스 메서드 인스턴스 없이 호출 가능
		System.out.println(MyMath.add(1, 2));
		System.out.println(MyMath.sub(3, 2));
		System.out.println(MyMath.mul(1, 2));
		System.out.println(MyMath.div(10, 5));
		
		MyMath m = new MyMath();
		
		m.a = 20;
		m.b = 10;
		// 인스턴스 메서드 
		System.out.println(m.add());
		System.out.println(m.mul());
		System.out.println(m.div());
		System.out.println(m.sub());
		
	}

}
