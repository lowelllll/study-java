package Generic;

import java.util.ArrayList;

interface Eatable {}
public class FruitBoxEx2 {

	public static void main(String[] args) {
		FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
		FruitBox<Apple> appleBox = new FruitBox<Apple>();
		FruitBox<Grape> grapeBox = new FruitBox<Grape>();
		// FruitBox<Toy> toyBox = new FruitBox<Toy>();  ERROR
		
		fruitBox.add(new Fruit());
		fruitBox.add(new Apple());
		fruitBox.add(new Grape());
		appleBox.add(new Apple());
		// appleBox.add(new Grape()); ERROR
		grapeBox.add(new Grape());
		
		System.out.println("fruitBox="+fruitBox);
		System.out.println("appleBox="+appleBox);
		System.out.println("grapeBox="+grapeBox);
		
	}

}

class FruitBox<T extends Fruit2> extends Box <T>{} // 제한된 지네릭 클레스
// Fruit을 상속받고 Eatable을 구현한 클래스만 타입 매개변수 허용
