class MethodOverloadingTest  
{
	// method overloading 오버로딩
	// static void f(char n) { System.out.println("char:"+n);} 형변환이 가능한 int형 자료형으로 바뀜
	static void f(byte n) { System.out.println("byte:"+n);}
	static void f(short n) { System.out.println("short:"+n);}
	static void f(int n) { System.out.println("int:"+n);}
	static void f(long n) { System.out.println("long:"+n);}
	static void f(float n) { System.out.println("float:"+n);}
	static void f(double n) { System.out.println("double:"+n);}

	public static void main(String[] args) 
	{
		short i = 1;
		long ln = 2;
		
		f('A');
		f(1);
		f(i);
		f(ln);
		f(3.141592);
	}
}
