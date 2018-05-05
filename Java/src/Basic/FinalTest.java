final class A
{
	public int a,b;
}
class B
{
	final void m1() {}
	final void m2(int a){}
}
class C extends A // cannot inherit from final A  상속 불가능
{
	public int c;
}
class D extends B
{
	void m1() {} //  error: m1() in D cannot override m1() in B
				// overridden method is final Override 불가능 
	void m2(int a,int b){}
}
class FinalTest
{
	public static void main(String[] args) 
	{
		A a = new A();
		B b = new B();
		C c = new C();
		D d = new D();
	}
}
