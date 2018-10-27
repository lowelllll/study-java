package oop2;

public class FighterTest {

	public static void main(String[] args) {
		Fighter f = new Fighter();
		
		if (f instanceof Unit) {
			System.out.println("f는 Unit의 자손");
		}
		
		if(f instanceof Fightable) {
			System.out.println("f는 fightable의 자손");
		}
		
		if(f instanceof Moveable) {
			System.out.println("f는 moveable을 구현함");
		}
		
		if(f instanceof Attackable) {
			System.out.println("f는 attakable을 구현함");
		}
		
		if (f instanceof Object) {
			System.out.println("f는 Object클래스의 자손");
		}
		 
	}
}

class Fighter extends Unit implements Fightable{
	public void move(int x,int y) {
		
	}
	public void attack(Unit u) {
		
	}
}

class Unit{
	int currentHp;
	int x;
	int y;
}

interface Moveable {
	void move(int x,int y);
}
interface Attackable{
	void attack(Unit u);
}

interface Fightable extends Moveable, Attackable {
	
}