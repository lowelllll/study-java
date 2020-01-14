package oop2;

public class SingletonTest {

	public static void main(String[] args) {
//		Singleton s = new Singleton(); ERROR !! 
		Singleton s = Singleton.getInstance();
	}

}

final class Singleton {
	// 상속을 해줄 수 없는 클래스임을 final로 명시 
	private static Singleton s = new Singleton();
	
	private Singleton() {
		//private 생성자로명시해 인스턴스를 생성하지 못하도록 함.
	}
	
	public static Singleton getInstance() {
		// 싱글톤 인스턴스를 반환 
		// 인스턴스 개수를 제한함.
		if(s==null) {
			s = new Singleton();
		}
		return s;
	}
}
