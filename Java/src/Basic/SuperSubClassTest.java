class A
{
	int x,y;
	A(){
		x= 0;
		y = 0;
	}
	public void set(int x,int y){
		this.x = x;
		this.y = y;
	}
	public int getX(){ return this.x; }
	public int getY(){ return this.y; }
}
class B extends A{
	int z;
	B(){
		x = 0;
		y = 0;
		z = 0;
	}
	public void set(int x,int y,int z){
		set(x,y);
		this.z = z;
	}
	public int getZ() { return this.z; }
}
class SuperSubClassTest
{
	public static void main(String[] args) 
	{
		A a1, a = new A();
		B b1, b = new B();
		a.set(10,10,10);
		b.set(5,5,5);
		a1 = b;	// 상위 자료형 변수는 하위 자료형 값을 가리킬 수 있음.
		b1 = a; //error  하위 자료형 변수는 상위 자료형 변수를 가리킬 수 없음
		// 하위 자료형은 상위 자료형을 확장한 자료형
	
	}
}
