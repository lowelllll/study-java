class MethodOverloadingTest  
{
	// method overloading �����ε�
	// static void f(char n) { System.out.println("char:"+n);} ����ȯ�� ������ int�� �ڷ������� �ٲ�
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
