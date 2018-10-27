package oop2;

public class RepairableTest {

	public static void main(String[] args) {
		Tank tank = new Tank();
		Dropship dropship = new Dropship();
		
		Marine marine = new Marine();
		SCV scv = new SCV();
		
		scv.repair(tank);
		scv.repair(dropship);
		// scv.repair(marine); ERROR 
	}

}

interface Repairable {}
class GroundUnit extends Unit2{
	GroundUnit(int hp){
		super(hp);
	}
}

class AirUnit extends Unit2{
	AirUnit(int hp){
		super(hp);
	}                                                                                                                                                                                                                                                                                                                                      
}

class Unit2{
	int hitPoint;
	final int MAX_HP;
	Unit2(int hp){
		this.MAX_HP = hp;
	}
}

class Tank extends GroundUnit implements Repairable{ // 고칠 수 있는 새로운 관계들 형성 (그룹?) interface를 통해
	Tank(){
		super(150);
		hitPoint = MAX_HP;
	}
	
	public String toString() {
		return "Tank";
	}
}

class Dropship extends AirUnit implements Repairable{
	Dropship(){
		super(125);
		hitPoint = MAX_HP;
	}
	
	public String toString() {
		return "Dropship";
	}
}

class Marine extends GroundUnit{
	Marine(){
		super(40);
		hitPoint = MAX_HP;
	}
}

class SCV extends GroundUnit implements Repairable{
	SCV(){
		super(60);
		hitPoint = MAX_HP;
	}
	
	void repair(Repairable r) {
		if (r instanceof Unit2) {
			Unit2 u = (Unit2)r;
			while(u.hitPoint != u.MAX_HP) {
				u.hitPoint++;
			}
			System.out.println(u+"의 수리가 끝났습니다.");
		}
	}
}