class A
{
	public int x = 1;
}
class B
{
	public int x = 3;
	B(){
		this.x = super.x;//error
	}
}
class  ExtendsTest
{
	public static void main(String[] args) 
	{
		B b = new B();
		System.out.println(b.x);
	}
}
