package Generic;

import java.util.ArrayList;

class Fruit implements Eatable { public String toString() { return "Fruit"; }}
class Apple extends Fruit { public String toString() { return "Apple"; }}
class Grape extends Fruit { public String toString() { return "Grape"; }}
class Toy { public String toString() { return "Toy"; }}
public class FruitBoxEx1 {

	public static void main(String[] args) {
		Box<Fruit> fruitBox = new Box<Fruit>();
		Box<Apple> appleBox = new Box<Apple>();
		Box<Toy> toyBox = new Box<Toy>();
		// Box<Grape> grapeVox = new Box<Apple>(); Error
		
		fruitBox.add(new Fruit());
		fruitBox.add(new Apple()); // OK fruit의 자손이므로 메서드의 매게변수가 될 수 있음.
		
		appleBox.add(new Apple());
		appleBox.add(new Apple());
		// appleBox.add(new Toy()); apple만 담을 수 있음 자손 X
		
		toyBox.add(new Toy());
		
		System.out.println(fruitBox.get(0));
		System.out.println(appleBox);
		System.out.println(toyBox);
	}

}

class Box<T>{ // 지네릭 클래스
	ArrayList<T> list = new ArrayList<T>();
	void add(T item) { list.add(item); }
	T get(int i) { return list.get(i);}
	int size() { return list.size(); }
	ArrayList<T> getList() { return list;}
	public String toString() { return list.toString(); }
	
}
