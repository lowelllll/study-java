package oop2;

public class InterfaceTest2 {
	// 인터페이스의 이해  
	public static void main(String[] args) {
		A a= new A();
		a.autoPlay(new B());
		a.autoPlay(new C());
	}

}

class A {
	void autoPlay(I i) {
		i.play();
		// I i = InstanceManager.getInstance(); -> 인스턴스를 얻어옴. 
	}
}

interface I {
	public abstract void play();
}

class B implements I {
	public void play() {
		System.out.println("play in B class");
	}
}

class C implements I {
	public void play() {
		System.out.println("play in C class");
	}
}

class InstanceManager {
	public static I getInstance() { // 제 3의 클래스의 메서드를
		return new B();
	}
}

