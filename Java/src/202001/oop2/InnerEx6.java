package oop2;

public class InnerEx6 {
	// 익명클래스 
	Object iv = new Object() { void method() {}}; 
	static Object cv = new Object() { void method() { }};
	
	void myMethod () {
		Object Iv = new Object() {void method() {}}; 
	}

}
