class ConstantClass 
{
	final static int MAXIMUM_NUM = 5;
	static int countNum = 0;
	final int num;
	ConstantClass() {
		this.num = ++countNum;
	}
	static boolean avaiableNum(){
		return countNum < MAXIMUM_NUM;
	}
	public String toString(){
		return "("+num+"/"+countNum+")";
	}
}
class  ConstantTest
{
	public static void main(String[] args) 
	{
		final int finalLocalVar;
		finalLocalVar = 10;
		inc(20);
		System.out.println("MAXMUM_NUM:"+ConstantClass.MAXIMUM_NUM);
		System.out.println(" "+new ConstantClass().num);
		System.out.println(" "+new ConstantClass().num);
		System.out.println(" "+new ConstantClass());
	}
	static int inc(final int a){
		System.out.println("final int a:"+a++);// final 변수를 변경하려고 했기 때문에 에러 발생.
		return a;
	}
}
