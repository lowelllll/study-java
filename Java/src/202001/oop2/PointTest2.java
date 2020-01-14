package oop2;

public class PointTest2 {

	public static void main(String[] args) {
		Point3D p = new Point3D(10, 20, 30);
		
		System.out.println(p.x);
		System.out.println(p.y);
		System.out.println(p.z);
	}

}

class Point {
	int x = 10;
	int y = 20;
	
	Point(int x, int y) {
		// super() -> Object() 최상위 조상 클래스 호
		this.x = x;
		this.y = y;
	}

}

class Point3D extends Point {
	int z = 30;
	
	Point3D() {
		this(100, 200, 300);
	}
	
	Point3D(int x, int y, int z) {
		super(x, y); 
		// super() 없으면 이걸 호출 
		this.z = z;
	}
}