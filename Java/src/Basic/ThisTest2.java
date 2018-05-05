class Point
{
	private int x,y;
	Point(){
		this(0,0);
		System.out.println("Point(): ("+x+","+y+")");
	}
	Point(int x,int y){
		this.x = x;
		this.y = y;
		System.out.println("Point(x,y): ("+x+","+y+")");
	}
	public void setX(int x){ this.x = x;}
	public void setY(int y){ this.y = y;}
	public int getX(){ return this.x; }
	public int getY(){ return this.y; }

	public void move (int x,int y){
		this.x += x;
		this.y += y;
	}
	public String toString(){
		return "("+this.x+","+this.y+")";
	}
}
class ThisTest2 
{
	public static void main(String[] args) 
	{
		Point p1 = new Point();
		Point p2 = new Point(10,20);
	}
}
