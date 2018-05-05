class  SuperClass
{
	void m1 (int i){
		System.out.println("SuperClass:m1:"+i+" ");
	}
	void m2 (float f){
		System.out.println("SuperClass:m2:"+f+" ");
	}
}
class SubClass extends SuperClass
{
	void m1(int i){
		super.m1(i);
		System.out.println("SubClass:m1:"+i+" "); // override
	}
	void m2(float f1,float f2){
		System.out.println("SubClass:m2:"+f1+","+f2+""); // overload
	}
	void m3(){
		System.out.println("SubClass:m3");
	}
}
class  OverridingTest
{
	public static void main(String[] args) 
	{
		SuperClass sup = new SuperClass(); 
		sup.m1(20); // super class  method
		SuperClass supersub = new SubClass();
		supersub.m1(30); // sub class method 마지막으로 재정의된 메소드 호출
		SubClass sub = new SubClass();
		sub.m1(10);
		sub.m2(3.141592f);
		sub.m2(30,20);
		sub.m3();
	}
}
