// 클래스의 초기화, 객체의 생성 과정
class Point
{
	private int x,y;
	Point(){
		System.out.println("Point()");
	}
	Point(int xValue,int yValue){
		x = xValue;
		y = yValue;
		System.out.println("Point("+x+","+y+")");
	} 
	public void setX(int xValue) { x = xValue; }
	public void setY(int yValue) { y = yValue; }
	public int getX() { return x; }
	public int getY() { return y; }
	public void move (int xValue,int yValue){
		x += xValue;
		y += yValue;
	}

	public String toString(){
		return "("+x+","+y+")";
	}
}
class ConstructionTest
{
	Point p1 = new Point();
	{
		System.out.println("Point p1 = new Point()");
	}
	Point p2;
	{
		p2 = new Point(10,20);
		System.out.println("p2 = new Point(10,20)");
	}

	ConstructionTest(){
		System.out.println("ConstructionTest()");
	}
	public static void main (String srgs[]){
		new ConstructionTest();
	}
}