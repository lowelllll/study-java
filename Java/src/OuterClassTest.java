// 내부 클래스
class OuterClass
{
	int i = 11;
	static int si = 12;
	class InnerClass
	{
		int j = 21;
		static int sj = 22; // 내부클래스는 클래스 변수를 가질 수 없음.
		static void staticMethod(){
		
		}// error 

		void print(){
			System.out.println("i = "+i)
			System.out.println("si = "+si)
			System.out.println("j = "+j)
			System.out.println("sj = "+sj)
		}
	}
	OuterClass(){
		InnerClass nested = new InnerClass();
		System.out.println(nested.j);
	}
}
class  OuterClassTest
{
	public static void main(String[] args) 
	{
		OuterClass outer = new OuterClass();
		System.out.println(outer.i);
		OuterClass.InnerClass inner = new OuterClass.InnerClass(); // outer.new InnerClass();
		System.out.println(inner.j);
	}
}
