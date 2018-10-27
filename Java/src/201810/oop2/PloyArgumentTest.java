package oop2;

public class PloyArgumentTest {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		
		b.buy(new ProductTv());
		b.buy(new Computer());
		
		System.out.println("현재 남은 돈은 "+b.money);
		System.out.println("현재 보너스 포인트는"+b.bonusPoint);
	}

}

class Product {
	int price;
	int bonusPoint;
	
	Product(int price){
		this.price = price;
		bonusPoint = (int)(price/10.0); // 보너스 점수는 제품 가격의 10%
	}
	
	Product(){}
}

class ProductTv extends Product {
	ProductTv() {
		super(100); // tv의 가격 100
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

class Buyer{
	int money = 1000;
	int bonusPoint = 0;
	
	void buy(Product p) {
		if (money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p+"를 구매하였습니다.");
	}
}