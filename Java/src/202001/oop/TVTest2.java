package oop;

class Tv {
	String color;
	boolean power;
	int channel;
	
	void power() { power = !power; }
	void channelUp() { channel++; }
	void channelDown() { channel--; }
}

public class TVTest2 {

	public static void main(String[] args) {
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		
		System.out.println(t1.channel);
		t1.channel = 7;
		System.out.println(t1.channel);

	}

}
