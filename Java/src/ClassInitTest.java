// 클래스 초기화, 객체 생성 과정
class A
{
	A(){
		System.out.println("A()"); //2
	}
}
class ClassInitTest
{
	static int monthNum = 12;
	static int monthDays[];
	static {
		monthDays = new int[monthNum];
		monthDays[0]=31; monthDays[1]= 28;
		monthDays[2]=31; monthDays[3]= 30;
		monthDays[4]=31; monthDays[5]= 30;
		monthDays[6]=31; monthDays[7]= 31;
		monthDays[8]=30; monthDays[9]= 31;
		monthDays[10]=30; monthDays[11]= 31;
		
		System.out.println("static int monthdays[];....");
	 //1
	 } 
	
	A a;
	{
		a = new A();
		System.out.println("A a;");//3
	}

	ClassInitTest(){
		this(0);
		System.out.println("ClassInitTest()");//5
	}

	ClassInitTest(int x){
		System.out.println("ClassInitTest(x)");//4
	}
	public static void main(String[] args) 
	{
		new ClassInitTest();
		System.out.println("new ClassInitTest()");//6
	}
}

/*
	클래스 초기화 먼저 수행.
	클래스 변수 초기화 수식,클래스 실행 블록 실행
	객체 초기화
	인스턴스 변수 , 메소드 초기화 수식, 인스턴스 실행 블록 실행
	실행 중 생성자에 다른 생성자가 맨 첫 줄에 나오면 다른 생성자 실행.
*/