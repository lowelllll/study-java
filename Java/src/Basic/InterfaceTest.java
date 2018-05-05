interface DataStructure
{
	int MAX_NUM = 100;
	boolean SUCCESS = true;
	boolean FAIL = false;
	boolean insert(Object obj);
	boolean delete(object obj);
	Object search(object obj);
	int numberOf();
}

class StackA implements DataStructure // 인터페이스의 모든 메소드가 구현되지 않았을 때 이 클래스는 추상클래스로  선언되야함. abstract class
{
	public boolean insert (Object obj) { return SUCCESS; }
	public boolean delete (Object obj) { return SUCCESS; }
}
class StackB implements DataStructure
{
	public boolean insert (Object obj) { return SUCCESS; }
	public boolean delete (Object obj) { return SUCCESS; }
	public Object search (Object obj) { return (Object)null; }
	public int numberOf() { return 0; }
}
class StackC extends StackA
{
	public Objects search(Object obj) { return (Object)null; }
	public int numberOf() { return 0; }
}
class  InterfaceTest
{
	public static void main(String[] args) 
	{
		DataStructure ds = new DataStructure(); // 추상 메소드가 포함된 추상클래스/인터페이스는 객체 생성 X
		StackA stackA = new StackA(); // 추상 메소드가 포함된 추상클래스 (인터페이스의 모든 메소드를 구현하지 않음)
		StackB stackB = new StackB();
		StackC stackC = new StackC();
		System.out.println("MAX_NUM:"+StackB.MAX_NUM);
	}
}
