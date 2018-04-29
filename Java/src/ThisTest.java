class Point 
{
	private int x,y;

	Point (){
		this(0,0);
	}
	Point(int x,int y){
		this.x = x;
		this.y = y;
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
class ThisTest 
{
	public static void main(String[] args) 
	{
		Point p1 = new Point();
		Point p2 = new Point(10,20);
		System.out.println("p1:"+p1);
		System.out.println("p2:"+p2);
	}
}
