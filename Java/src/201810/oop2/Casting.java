package oop2;

public class Casting {
	public static void main(String args[]) {
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car = fe; // car = (Car)fe; 형변환
		// car.water(); Error!
		fe2 = (FireEngine) car; // 형변환 원래 fe는 FireEngine이므로 ㄱㅊ
		fe2.water();
	} 
}

class Car {
	String color;
	int door;
	
	void drive() {
		System.out.println("drive~ brrr~");
	}
	
	void stop() {
		System.out.println("Stop!!!");
	}
}


class FireEngine extends Car{
	void water() {
		System.out.println("water!!!");
	}
}