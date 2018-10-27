package oop2;

public class InterfaceTest2 {

	public static void main(String[] args) {
		A2 a = new A2();
		a.autoPlay(new B2()); // 인터페이스를 구현한 클래스의 인스턴스를 동적으로 제공받아야함.
		a.autoPlay(new C2());
	}

}

interface I2{
	public abstract void play();
}

class A2{
	void autoPlay(I2 i) {
		i.play();
	}
}

class B2 implements I2{
	public void play() {
		System.out.println("play in B class");
	}
}

class C2 implements I2{
	public void play() {
		System.out.println("play in C class");
	}
}

