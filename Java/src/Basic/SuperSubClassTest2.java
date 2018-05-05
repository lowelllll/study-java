class A
{
	int x,y;
	public void setXY(int x,int y){
		this.x = x;
		this.y = y;
	}
	public int getX(){ return this.x; }
	public int getY(){ return this.y; }
}
class B extends A
{
	int z;
	public void setXYZ(int x,int y,int z){
		setXY(x,y);
		this.z = z;
	}
	public int getZ() { return this.z; }
}
class  SuperSubClassTest2
{
	public static void main(String[] args) 
	{
		A a;
		B b = new B();
		a = b; // 상위 자료형의 변수가 하위 자료형의 값을 가리킬 수 있음.
		b.setXYZ(1,2,3);
		System.out.println(String.format("XYZ(%d,%d,%d)",b.getX(),b.getY(),b.getZ()));
		a.setXY(4,5);
		System.out.println(String.format("XYZ(%d,%d,%d)",b.getX(),b.getY(),b.getZ()));
		b.setXY(6,7);
		System.out.println(String.format("XYZ(%d,%d,%d)",b.getX(),b.getY(),b.getZ()));
	}
}
