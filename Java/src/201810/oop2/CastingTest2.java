package oop2;

public class CastingTest2 {

	public static void main(String[] args) {
		Car car = new Car();
		Car car2 = null;
		FireEngine fe = null;
		
		car.drive();
		fe = (FireEngine) car; // car는 Car의 인스턴스이므로 조상타입의 인스턴스를 자손타입의 참조변수로 참조하는 것은 허용 X
		fe.drive();
		car2 = fe; // 자동 형변환 car2 = (Car)fe;
		car2.drive();
	}

}
