class Point
{
	private int x,y;
	Point(){ //������
		
	}
	Point(int xValue,int yValue){
		x = xValue;
		y = yValue;
	}
	public void setX(int xValue) { x=xValue;}
	public void setY(int yValue) { y=yValue;}
	public int getX() { return x;}
	public int getY() { return y;}
	public void move (int xValue, int yValue){
		x += xValue;
		y += yValue;
	}
	public String toString(){ // python __str__ ����� ����ε� 
		return ("("+x+","+y+")");
	}
}

class ConstructorTest
{
	public static void main(String[] args) 
	{
		Point p1 = new Point();
		Point p2 = new Point(10,20);
		System.out.println("p1:"+p1);
		System.out.println("p2:"+p2);
	}
}
