class OuterClass2 
{
	int i=11;
	static int si = 12;
	class InnerClass2 
	{
		int j =  21;
		void print(){
			System.out.println("i = "+i);
			System.out.println("i = "+OuterClass2.this.i);
			System.out.println("si = "+si);
			System.out.println("j = "+j);
		}
	}
	OuterClass2(){
			InnerClass2 nested = new InnerClass2();
			System.out.println(nested.j);
	}
}
class OuterClassTest2
{
	public static void main(String[] args) 
	{
		OuterClass2 outer = new OuterClass2();
		System.out.println(outer.i);
		OuterClass2.InnerClass2 inner = outer.new InnerClass2();
		System.out.println(inner.j);
	}
}
