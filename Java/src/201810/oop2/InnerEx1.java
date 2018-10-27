package oop2;

public class InnerEx1 {
	// 내부클래스 
	private int outerIv = 0;
	static int outerCv = 0;
	
	class InstanceInner{ // 인스턴스 클래스
		int ilv = outerIv; // 인스턴스 멤버변수 사용 가능 외부의 private 멤버도 접근 가능함.
		int ilv2 = outerCv; // 클래스 멤버변수 사용 가능
	}
	
	static class StaticInner{
		// 외부 클래스의 인스턴스 멤버에 접근 불가능
		static int scv = outerCv;
	}
	
	void myMethod() {
		int lv = 0;
		final int LV=0; // 상수
		
		class LocalInner{
			int liv = outerIv;
			int liv2 = outerCv;
			// int liv3 = Iv; 외부 클래스의 지역변수는 지역 상수만 접근 가능함. 
			int liv4 = LV;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
