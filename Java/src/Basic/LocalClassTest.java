
class  LocalClassTest
{
	int i = 11;
	static int si = 12;
	final int f1 = 13;
	
	Object getLocalClass(int pi){
		int mi = 21;
		static int msi = 22;  // 메소드 내에서는 static 지역변수를 선언하지 못함.
		final int mfi = 23;
		class Localclass
		{
			public String toString(){
				return "LocalClass:"+i+","+si+","+fi+","+pi+","+mi+","+msi+","+mfi;
				// pi , mi 
				// 지역 클래스에서는 자신을 포함한 메소드의 final 변수에만 접근 가능함. 
				// 메모리 실행이 끝나도 저장되어야하기 때문
				
			}

		}
		return new LocalClass();
	}
	public static void main(String[] args) 
	{
		Object localClass = new LocalClassTest.getLocalClass();
		System.out.println("Test-"+localClass);
	}
}
