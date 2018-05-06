import java.lang.*;
class PrimeThread extends Thread
{
	int number;
	PrimeThread(int n){
		super();
		number = n;
	}
	PrimeThread(String s,int n){
		super(s);
		number = n;
	}
	public void run(){
		int n = 3; // 소수는 3부터 시작함.
		while(n < number){
			if(isPrimeNumber(n))
				System.out.println(getName()+":"+n+"is prime number"); // getName 스레드의 이름을 얻음
			n++;
			try{
				sleep(100); // 아무일도 하지않고 일정시간 기다림
				// 안정적인 cpu 사용률
			}
			catch (InterruptedException e) // sleep 메소드가 발생하는 exception 
			{

			}
		}
	}
	public boolean isPrimeNumber(int n){ // 소수 판별
		int  i;
		for(i=2;i<=(n/2);i++){
			if((n%i)==0) return false;
		}
		return true;
	}
}
class  ThreadTest
{
	public static void main(String[] args) 
	{
		Thread primeThread = new PrimeThread(30); // 스레드 객체 생성 
		System.out.println("PrimeThread:"+primeThread);
		primeThread.setName("PrimeThread");// 스레드의 이름을 바꿈 Thread 메소드
		System.out.println("PrimeThread:"+primeThread);
		primeThread.start();
	}
}
