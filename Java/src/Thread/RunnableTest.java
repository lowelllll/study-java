import java.lang.Thread;
import java.lang.Runnable;

class  PrimeThread implements Runnable
{
	int number;
	String name;
	PrimeThread(int n){
		name = null;
		number = n;
	}
	PrimeThread(String s,int n){
		name = s;
		number = n;
	}
	public void run(){
		int n=3;
		while(n<number){
			if(isPrimeNumber(n)){
				System.out.println(name+":"+n+" is prime number");
			}
			n++;
			try{
				Thread.sleep(100);
			}catch(InterruptedException e)
			{
			}
		}
	}
	public boolean isPrimeNumber(int n){
		int i;
		for(i=2;i<=(n/2);i++){
			if((n%i)==0) return false;
		}
		return true;
	}
}

class RunnableTest
{
	public static void main(String[] args) 
	{
		Thread primeThread = new Thread(new PrimeThread(30)); // Thread 객체를 상속받지 않고 Runnable 인터페이스 구현으로 Thread 생성
		System.out.println("PrimeThread:"+primeThread);
		primeThread.setName("PrimeThread");
		System.out.println("PrimeThread:"+primeThread);
		primeThread.start();
	}
}
