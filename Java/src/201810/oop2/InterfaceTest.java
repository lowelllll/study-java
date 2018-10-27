package oop2;

public class InterfaceTest {

	public static void main(String[] args) {
		A a = new A();
		a.methodA(new B());
	}

}

interface I {
	public abstract void methodB();
}
class A{ // 메소드를 사용하는 입장
	public void methodA(I i) {
		i.methodB();
	}
}

class B implements I{
	public void methodB() {
		System.out.println("methodB()");
	}
}
