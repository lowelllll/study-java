package oop2;

// 보통 이렇게 안함. 
class Outer{
	class InstanceInner{
		int iv = 100;
	}
	
	static class StaticInner{
		int iv = 200;
		static int cv = 300;
	}
	
	void myMethod() {
		class LocalInner{
			int iv = 400;
		}
	}
}

public class InnerEx2 {

	public static void main(String[] args) {
		Outer oc = new Outer();
		// 인스턴스 클래스의 인스턴스를 생성하기 위해선 외부 클래스의 인스턴스부터 생성해야함.
		Outer.InstanceInner ii = oc.new InstanceInner();
		
		System.out.println("ii.iv:"+ii.iv);
		System.out.println("Outer.StaticInner.cv:"+Outer.StaticInner.cv);
		
		// 스태틱 내부 클래스의 인스턴스는 바로 생성 가능
		Outer.StaticInner si = new Outer.StaticInner();
		System.out.println("si.iv"+si.iv);
	}
	
	

}
