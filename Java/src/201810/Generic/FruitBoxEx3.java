package Generic;

import java.util.ArrayList;

class Juice {
	String name;
	
	public Juice(String name) {
		this.name = name + "Juice";
	}
	
	public String toString() { return name;}
}

class Juicer {
	static Juice makeJuice(FruitBox<? extends Fruit> box) {
		//  와일드 카드 사용 Fruit의 자손은 모두 허용 
		String tmp = "";
		
		for(Fruit f: box.getList()) {
			tmp += f +" ";
		}
		
		return new Juice(tmp);
	}
}
public class FruitBoxEx3 {

	public static void main(String[] args) {
		FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
		FruitBox<Apple> appleBox = new FruitBox<Apple>();
		
		fruitBox.add(new Apple());
		fruitBox.add(new Grape());
		appleBox.add(new Apple());
		appleBox.add(new Apple());
		
		System.out.println(Juicer.makeJuice(fruitBox));
		System.out.println(Juicer.makeJuice(appleBox));
	}

}
