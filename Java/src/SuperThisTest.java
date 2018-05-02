class A
{
	static int check(String msg){
		System.out.println(msg);
		return 0;
	}
	int a = check("int a");
	public A() { check("public A"); }
}

class SuperThisTest extends A
{
	public int b = check("int b");
	public SuperThisTest(){
		// 자동으로 super(); 실행
		check("public SuperThisTest()");
	}
	public static void main(String[] args) 
	{
		SuperThisTest b = new SuperThisTest();
	}
}
