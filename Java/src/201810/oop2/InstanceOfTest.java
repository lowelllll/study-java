package oop2;

public class InstanceOfTest {

	public static void main(String[] args) {
		FireEngine fe = new FireEngine();
		
		if (fe instanceof FireEngine) {
			System.out.println("this is a Fireengine instance");
		}
		
		if (fe instanceof Car) {
			System.out.println("this is a Car instance");
		}
		
		if (fe instanceof Object) {
			System.out.println("this is a Object instance");
		}
		
		System.out.println(fe.getClass().getName());
	}

}
