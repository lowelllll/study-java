abstract class A
{
	abstract void m1();
	abstract void m2();
	void m3(){}
}

abstract class B extends A
{
	void m1{}
}

class C extends B
{
	void m2(){}
}

class AbstractTest
{
	public static void main(String args[]){
		A a; // 추상 클래스 참조형 변수는 선언 가능
		B b;
		C c;
		a = new A(); //error
		c = new C();
	}
}

