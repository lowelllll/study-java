class A
{
	int x,y;
	A(){
		x = 0;
		y = 0;
	}
	public void setXY(int x,int y){
		this.x = x;
		this.y = y;
	}
	public int getX() { return this.x; }
	public int getY() { return this.y; }
}
class B extends A
{
	int z;
	public void setXYZ(int x,int y , int z)
	{
		setXY(x,y);
		this.z = z;
	}
	public int getZ() { return this.z; }
}
class InheritanceTest
{
	public static void main(String[] args) 
	{
		A a = new A();
		B b = new B();
		a.setXY(1,2);
		b.setXYZ(3,4,5);
		System.out.println("XY("+a.getX()+","+a.getY()+")");
		System.out.println("XYZ("+b.getX()+","+b.getY()+","+b.getZ()+")");
	}
}
