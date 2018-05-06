import java.lang.*;
// class SumThread extends Thread 
class SumThread implements Runnable
{
	static int count = 0;
	int id;
	int start,end,sum;

	SumThread(int start,int end){
		this.start = start;
		this.end = end;
		this.id = count++;
	}

	public String getName(){
		return "Thread-"+id;
	}
	public int getSum(){
		return sum;
	}
	public void run(){
		sum = 0;
		for (int i=start;i<=end ;i++ )
		{
			sum += i;
			System.out.println(getName()+":"+sum);
		}
	}
}

class ThreadJoinTest  
{
	public static void main(String[] args) 
	{
		// SumThread t1 = new SumThread(1,1000); //Thread class
		// SumThread t2 = new SumThread(1001,2000); 

		SumThread rt1 = new SumThread(1,10); // Runnable Interface
		SumThread rt2 = new SumThread(11,20);

		Thread t1 = new Thread(rt1);
		Thread t2 = new Thread(rt2);

		t1.start();
		t2.start(); // Thread 실행

		try{
			t1.join(); // Thread가 종료되기를 기다림.
			t2.join();
		}
		catch (InterruptedException e)
		{
		}
		// t1.getSum() , t2.getSum() ?? 
		System.out.println("Sum(10,20) : " + (rt1.getSum()+rt2.getSum()));
	}
}
