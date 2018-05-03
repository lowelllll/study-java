class A
{
	public int x;
	protected int y;
	private int z;
	int getX(){ return this.x; }
	private getY(){ return this.y; }
	protected int getZ{ return this.z; }
}

class B extends A
{
	public int x; // override
	public void setXYZ(int x,int y,int z){
		this.x = x;
		this.y = y;
		this.z = z; //error 
	}
}
class  AccessRightTest
{
	public static void main(String[] args) 
	{
		B b = new B();
		b.getX();
		b.getY(); //error
		b.getZ();
	}
}
