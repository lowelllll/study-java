package oop2;

public class AbTest {

	public static void main(String[] args) {
		Unit[] group = new Unit[4];
		
		group[0] = new Marine();
		group[1] = new Tank();
		group[2] = new DropShip();

		group[0].move(100, 200); // marine의 move 호출  
		
	}

}

abstract class Unit {
	int x, y;
	abstract void move (int x, int y);
	void stop() { }
}

class Marine extends Unit {
	void move (int x, int y) {}
	void stimPack() {}
}

class Tank extends Unit {
	void move (int x, int y) {}
}

class DropShip extends Unit {
	void move (int x, int y) {}
}