package oop2;

import java.util.Vector;

public class PloyArgumentTest3 {

	public static void main(String[] args) {
		Buyer3 b = new Buyer3();
		ProductTv2 tv = new ProductTv2();
		Computer2 com = new Computer2();
		Auodio2 audio = new Auodio2();
		
		b.buy(tv);
		b.buy(com);
		b.buy(audio);
		b.summary();
		System.out.println();
		b.refund(com);
		b.summary();
	}

}

class Product2{
	int price;
	int bonusPoint;
	
	Product2(int price){
		this.price = price;
		bonusPoint = (int)(this.price/10.0);
	}
	
	Product2(){
		this.price = 0;
		bonusPoint = 0;
	}
}


class ProductTv2 extends Product2 {
	ProductTv2() {
		super(100); // tv의 가격 100
	}
	
	public String toString() {
		return "Tv";
	}
} 

class Computer2 extends Product2 {
	Computer2() {
		super(200);
	}
	
	public String toString() {
		return "Computer";
	}
}

class Auodio2 extends Product2 {
	Auodio2 () { super(50); }
	
	public String toString() { return "Audio"; }
}

class Buyer3 {
	int money = 1000;
	int bonusPoint = 0;
	Vector item = new Vector<>(); // 객체 배열
	
	void buy(Product2 p) {
		if (money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		item.add(p);
		System.out.println(p+"를 구매하셨습니다");
	}
	
	void refund(Product2 p) {
		if(item.remove(p)) {
			money += p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println(p+"를 반품하셨습니다.");
		} else {
			System.out.println("구입하신 제품 중 해당 제품이 없습니다.");
		}
	}
	
	void summary() {
		int sum = 0;
		String itemList = "";
		
		if (item.isEmpty()) {
			System.out.println("구입하신 제품이 없습니다");
			return;
		}
		for(int i=0; i<this.item.size(); i++) {
			Product2 p = (Product2) item.get(i);
			sum += p.price;
			itemList += (i==0)? "" + p: ", "+p;
		}
		
		System.out.println("구입하신 물품의 총 금액은"+sum+"만원 입니다.");
		System.out.println("구입하신 제품은"+itemList+"입니다");
	}
}


