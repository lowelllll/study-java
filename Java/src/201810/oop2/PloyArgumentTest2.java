package oop2;

public class PloyArgumentTest2 {

	public static void main(String[] args) {
		Buyer2 b = new Buyer2();
		
		b.buy(new ProductTv());
		b.buy(new Computer());
		b.buy(new Auodio());
		b.summary();
	}
}


class Auodio extends Product {
	Auodio () { super(50); }
	
	public String toString() { return "Audio"; }
}

class Buyer2 {
	int money = 1000;
	int bonusPoint = 0;
	
	Product[] item = new Product[10]; // 구입한 제품
	int idx = 0;
	
	void buy(Product p) {
		if (money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		item[idx++] = p;
		System.out.println(p+"를 구매하셨습니다");
	}
	
	void summary() {
		int sum = 0;
		String itemList = "";
		
		for(int i=0; i<this.item.length; i++) {
			if(this.item[i]==null) break;
			sum += item[i].price;
			itemList += item[i] + ", ";
		}
		
		System.out.println("구입하신 물품의 총 금액은"+sum+"만원 입니다.");
		System.out.println("구입하신 제품은"+itemList+"입니다");
	}
	
}