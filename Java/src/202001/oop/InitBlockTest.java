package oop;

class Block {

}

public class InitBlockTest {
	static { // 1
		System.out.println("static {}"); //클래스 변수 초기화 블럭 
	}
	
	{ System.out.println("{}"); } // 인스턴스 변수 초기화 블럭  // 3
	// 인스턴스가 생성될 때 마다 실
	
	public InitBlockTest (){
		System.out.println("생성"); // 4
	}
	
	public static void main(String[] args) {
		System.out.println("InitBlockTest i = new InitBlockTest();"); // 2
		InitBlockTest i = new InitBlockTest();
		
		System.out.println("InitBlockTest i2 = new InitBlockTest();");
		InitBlockTest i2 = new InitBlockTest();
	}

}
