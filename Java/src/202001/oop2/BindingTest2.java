package oop2;

public class BindingTest2 {

	public static void main(String[] args) {
		// 참조변수와 인스턴스 연결 
		
		Parent p = new Child();
		Child c = new Child();
		
		System.out.println("p.x = " +p.x); // Parent 
		p.method(); // Child
		
		System.out.println("c.x = "+c.x); // Child 
		c.method(); // Child
	}

}

class Parent {
	int x = 100;
	
	void method() {
		System.out.println("Parent Method");
	}
}

class Child extends Parent {
	int x = 200;
	
	void method() {
		System.out.println("Child Method");
	}
 }