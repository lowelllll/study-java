class Point {
	int x,y;
	void setX(int xValue) {x = xValue;}
	void setY(int yValue) {y = yValue;}
	int getX(){ return x;}
	int getY(){ return y;}
	void move (int xValue , int yValue){
		x += xValue;
		y += yValue;
	}
}


class Circle{
	Point center = new Point();
	// center 클래스 참조형 변수
	int radius;
	void setRadius (int r) { radius = r;}
	void setCenter(int x,int y){
		center.setX(x);
		center.setY(y);
	}
	int getRadius() { return radius;}
	int getCenterX() { return center.getX();}
	int getCenterY() { return center.getY();}
	double getArea() { return Math.PI * radius * radius ;}
}

class ClassTest{
	public static void main (String args[]){
		Circle c1 = new Circle() , c2 ;
		c2 = new Circle();
		c1.setRadius(5);
		c1.setCenter(10,10);
		c2.setRadius(10);
		c2.setCenter(20,20);

		System.out.println("c1(x,y,r) : ("+c1.getCenterX()+","+c1.getCenterY()+","+c1.getRadius()+")");
		System.out.println("c2(x,y,r) : ("+c2.getCenterX()+","+c2.getCenterY()+","+c2.getRadius()+")");

	}
}