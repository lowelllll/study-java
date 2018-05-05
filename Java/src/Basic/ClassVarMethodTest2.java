// 클래스 변수, 메소드 사용하기 2
class Point
{
	private static int countPoint = 0; // 클래스 변수
	private int pointID;
	private int x,y;

	Point(){
		this(0,0);
	}
	Point(int x,int y){
		pointID = ++countPoint;
		this.x = x;
		this.y = y;
	}
	
	public static int getCount() { return countPoint;} // 클래스 메소드 
	public int getID() { return pointID; } // error -> 클래스 메소드가 인스턴스 변수에 접근을 시도했기 때문
	public static int getID(Point p){
		return p.pointID;
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
		return "("+this.getID()+"/"+this.getCount()+":"+this.x+","+this.y+")";
	}

}
class ClassVarMethodTest2
{
	public static void main(String[] args) 
	{
		Point p1 = new Point();
		Point p2 = new Point(10,20);
		System.out.println("p1:"+p1);
		System.out.println("p2:"+p2);
	}
}
