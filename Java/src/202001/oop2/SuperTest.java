package oop2;

public class SuperTest {

	public static void main(String[] args) {
		ChildSuper c = new ChildSuper();
		c.foo();
	}

}

class ParentSuper {
	int x;
	int y;
	
	void foo() {
		System.out.println("parent");
	}
}

class ChildSuper extends ParentSuper {
	void foo() {
		System.out.println("child");
		super.foo(); //조상 메소드 호출 
	}
}