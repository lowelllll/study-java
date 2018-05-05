class A
{
	int i;
	public int j;
	protected int k;
	private int l;
}

class B extends A
{
	public void print(){
		System.out.println("i:"+i);
		System.out.println("j:"+j);
		System.out.println("k:"+k);
		System.out.println("l:"+l); //error 
	}
}
class  AccessRightTest2
{
	public static void main(String[] args) 
	{
		A a = new A();
		new B().print();
		System.out.println("i:"+a.i);
		System.out.println("j:"+a.j);
		System.out.println("k:"+a.k);
		System.out.println("l:"+a.l); //error 
	}
}
