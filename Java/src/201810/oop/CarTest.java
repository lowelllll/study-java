package oop;

class Car{
	String color;
	String gearType;
	int door;
	
	Car(){
		this("white","auto",4); // 생성자 호출
	}
	
	Car(Car c){
		this(c.color, c.gearType, c.door); // 생성자를 이용한 인스턴스 복사 (참조 X 복사 O)
	}
	Car(String color){
		this(color, "auto", 4);
	}
	
	Car(String color, String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
}
public class CarTest {

	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car("blue");
		
		System.out.printf("c1의 color:%s, gearType:%s, door:%d\n",c1.color, c1.gearType, c1.door);
		System.out.printf("c2의 color:%s, gearType:%s, door:%d",c2.color, c2.gearType, c2.door);

	}

}
