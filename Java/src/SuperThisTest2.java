class A
{
	static int check(String msg){
		System.out.println(msg);
		return 0;
	}
	int a = check("int a");//1
	public A(){
		check("public A()");//2
	}
	public A(int i){
		this();
		check("public A ("+i+") after this()");//3
	}
}
class SuperThisTest2 extends A
{
	public int b = check("public int b");//4
	public SuperThisTest2(){
		super(1);
		check("public SuperThisTest2()");//5
	}
	public static void main(String[] args) 
	{
		SuperThisTest2 b = new SuperThisTest2();
	}
}
