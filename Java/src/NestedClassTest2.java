// 중첩 클래스
class NestingClass2
{
	int i=11;
	static int si = 12;
	static class NestedClass2
	{
		int j = 21;
		static int sj = 22;
		void print(){
			System.out.println("si = "+si);
			System.out.println("j = "+j);
		}
	}
	NestingClass2(){
		NestedClass2 nested = new NestedClass2();
		System.out.println(nested.j);
	}
}

class  NestedClassTest2
{
	public static void main(String[] args) 
	{
		NestingClass2 nesting = new NestingClass2();
		System.out.println(nesting.i);
		NestingClass2.NestedClass2 nested = new NestingClass2.NestedClass2();
		System.out.println(nested.j);
	}
}
