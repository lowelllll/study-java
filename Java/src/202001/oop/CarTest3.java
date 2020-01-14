package oop;

class Car {
	String color;
	String gearType;
	int door;
	
	Car() {
		this("white", "auto", 4);
	}
	
	Car(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	
	Car(Car c) {
//		this.color = c.color;
//		this.gearType = c.gearType;
//		this.door = c.door;
		this(c.color, c.gearType, c.door);
	}
}

public class CarTest3 {

	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car(c1); // 인스턴스 복사  
		
		c1.door = 7;
		
		System.out.println(c1.door);
		System.out.println(c2.door); // 서로 독립적인 메모리 공간에 존재한 별도의 인스턴스 
	}

}
