package oop2;

public class RepairableTest {
	public static void main(String[] args) {
		Tank2 tank = new Tank2();
		DropShip2 dropship = new DropShip2();
		
		Marine2 marine = new Marine2();
		SCV scv = new SCV();
		
		scv.repair(tank);
		scv.repair(dropship);
	}

}

interface Repairable {} // 인터페이스를 사용해 기존의 상속 체계를 유지하며기계화 유닛의 공통점을 부여함 
 
class Unit2 {
	int hitPoint;
	final int MAX_HP;
	Unit2 (int hp) {
		MAX_HP = hp;
	}
}

class GroundUnit2 extends Unit2{
	GroundUnit2(int hp) {
		super(hp);
	}
}

class AirUnit2 extends Unit2 {
	AirUnit2 (int hp) {
		super(hp);
	}
}

class Tank2 extends GroundUnit2 implements Repairable {
	Tank2() {
		super(150);
		hitPoint = MAX_HP;
	}
	
	public String toString() {
		return "Tank";
	}
}

class DropShip2 extends AirUnit2 implements Repairable {
	DropShip2() {
		super(125);
		hitPoint = MAX_HP;
	}
	
	public String toString() {
		return "DropShip";
	}
}

class Marine2 extends GroundUnit2 {
	Marine2() {
		super(40);
		hitPoint = MAX_HP;
	}
	
}

class SCV extends GroundUnit2 implements Repairable {
	SCV() {
		super(60);
		hitPoint = MAX_HP;
	}
	
	void repair(Repairable r) { 
		if (r instanceof Unit2) {
			Unit2 u = (Unit2) r;
			while (u.hitPoint != u.MAX_HP) {
				u.hitPoint ++;
			}
			System.out.println(u +"의 수리가 끝났습니다.");
		}
	}
}


