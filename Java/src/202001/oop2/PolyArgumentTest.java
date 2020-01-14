package oop2;

import java.util.*;


public class PolyArgumentTest {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		
		
		System.out.println("남은 금액 : "+b.money);
		System.out.println("포인트: "+b.bonusPoint);
		System.out.println("총 구매액:"+ b.summary());
	}

}

class Product {
	int price;
	int bonusPoint; // point
	
	Product(int price) {
		this.price = price;
		bonusPoint = (int) (price/10.0); // product 10% 
	}
}

class Tv extends Product {
	Tv() {
		super(100); // 100price
	}
	
	public String toString() {
		return "Tv";
	}
}

class Computer extends Product {
	Computer() {
		super(200);
	}
	
	public String toString() {
		return "Computer";
	}
}

class Buyer {
	int money = 10000;
	int bonusPoint = 0;
//	Product[] items = new Product[10];
	Vector items = new Vector();
	
	void buy(Product p) { // 매개변수의 다형성  
		if (money < p.price) {
			System.out.println("잔액이 부족합니다.");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		
//		items[i++] = p;
		items.add(p);
		System.out.println(p+"를 구매하셨습니다.");
	}
	
	int summary() {
		int sum = 0;
		
		if(items.isEmpty()) {
			return 0;
		}
		
//		for(Product p: items) {
//			if(p == null) break; // nullPointException ! 
//			sum += p.price;
//		}
		
		for (int i = 0; i<items.size(); i++) {
			Product p = (Product)items.get(i);
			sum += p.price;
		}
		return sum;
		
	}
}