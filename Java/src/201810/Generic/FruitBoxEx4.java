package Generic;

import java.util.*;

class Fruit2 {
	String name;
	int weight;
	
	Fruit2(String name, int weight){
		this.name = name;
		this.weight = weight;
	}
	
	public String toString() {return name+"("+weight+")"; }
}

class Apple2 extends Fruit2 {
	Apple2(String name, int weight){
		super(name, weight);
	}
}

class Grape2 extends Fruit2{
	Grape2(String name, int weight){
		super(name, weight);
	}
}

class AppleComp implements Comparator<Apple2>{
	public int compare(Apple2 t1, Apple2 t2) {
		return t2.weight - t1.weight;
	}
}

class GrapeComp implements Comparator<Grape2>{
	public int compare(Grape2 t1, Grape2 t2) {
		return t2.weight - t1.weight;
	}
}

class FruitComp implements Comparator<Fruit2>{
	public int compare(Fruit2 t1, Fruit2 t2) {
		return t2.weight - t1.weight;
	}
}

public class FruitBoxEx4 {

	public static void main(String[] args) {
		FruitBox<Apple2> appleBox = new FruitBox<Apple2>();
		FruitBox<Grape2> grapeBox = new FruitBox<Grape2>();
	
		appleBox.add(new Apple2("GreenApple",300));
		appleBox.add(new Apple2("GreenApple",100));
		appleBox.add(new Apple2("GreenApple",200));
		
		grapeBox.add(new Grape2("GreenGrape",400));
		grapeBox.add(new Grape2("GreenGrape",300));
		grapeBox.add(new Grape2("GreenGrape",200));
		
		Collections.sort(appleBox.getList(), new AppleComp());
		Collections.sort(grapeBox.getList(), new GrapeComp());
		
		System.out.println(appleBox);
		System.out.println(grapeBox);
		
		System.out.println();
		
		Collections.sort(appleBox.getList(), new FruitComp());
		Collections.sort(grapeBox.getList(), new FruitComp());
		
		System.out.println(appleBox);
		System.out.println(grapeBox);
	}

}
