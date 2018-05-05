class NestingClass
{
	int i = 11;
	static int si = 12;
	static class NestedClass
	{
		int j = 21;
		static int sj = 22;
		void print(){
			System.out.println("i = "+i); //non-static variable i cannot be referenced from a static context 
			// 클래스 메소드와 같이 인스턴스 변수, 인스턴스 메소드에 접근할 수 없음.
			System.out.println("j = "+j);
			System.out.println("si = "+si); 
			// 클래스 변수,클래스 메소드에는 접근 가능
		}
	}
	NestingClass(){
		NestedClass nestedclass = new NestedClass();
		System.out.println(nested.j);
	}
}
class  NestedClassTest
{
	public static void main(String[] args) 
	{
		NestingClass nesting = new NestingClass();
		System.out.prinln(nesting.i);
		NestingClass.NestedClass nested = new NestingClass.NestedClass(); //패키지처럼 중첩 클래스에 접근
		System.out.println(nested.j); // 클래스 변수 출력
	}
}
