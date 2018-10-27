package oop;

class Data2 {
	int x;
}
public class ReferenceParamEx {

	public static void main(String[] args) {
		Data2 d = new Data2();
		d.x = 10;
		
		System.out.println("main():x="+d.x);
		
		change2(d);
		System.out.println("after change(d)");
		System.out.println("Main() : x="+d.x);
	}
	
	static void change2(Data2 d) { // 참조형 -> 인스턴스 주소가 복사됨. 참조형 매게변수
		d.x = 1000; 
		System.out.println("x="+d.x);
	}
	}


