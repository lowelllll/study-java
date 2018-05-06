import java.lang.*;
class NeverStopThread extends Thread
{
	int i =0;
	public void run(){
		while(true){
			try{
				sleep(100);
				System.out.println(getName()+":"+i++);
			}
			catch (InterruptedException e)
			{
			}
		}
	}
}
class  ThreadStopTest
{
	public static void main(String[] args) 
	{
		Thread t = new NeverStopThread();
		t.start();
		try{
			Thread.sleep(1000); // 일정시간 기다린 후 스레드를 멈춤.
			// t.join(1000);
			// t.join(1000,0); 기다리는 시간은 같음
		}
		catch (InterruptedException e){
		}
		t.stop(); // 생성한 스레드 멈춤
	}
}
