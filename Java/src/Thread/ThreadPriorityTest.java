import java.lang.*;
class ThreadWithPriority extends Thread
{
	ThreadWithPriority(){
	}
	ThreadWithPriority(int priority){
		setPriority(priority);
	}
	public void run(){
		int i=0;
		while(i++<20){
			System.out.println(this); // this.toString();
		}
	}
}
class  ThreadPriorityTest
{
	public static void main(String[] args) 
	{
		// 라운드 로빈 방식
		Thread.currentThread().setPriority(Thread.NORM_PRIORITY+3); //8 
		// main 메소드도 하나의 스레드로 실행됨.
		Thread t1 = new ThreadWithPriority(); // 5 
		// 현재 스레드가 갖는 우선순위를 그대로 상속함.
		Thread t2 = new ThreadWithPriority(6);
		Thread t3 = new ThreadWithPriority(4);
		// 우선순위가 높은 t2 스레드가 가장 많이 실행됨. t1 스레드가 실행되다가도 t2스레드에 의해 CPU를 빼앗김 
		// t1,t2,t3은 자신의 타임 슬라이스만큼 라운드-로빈 방식에 의해 순서대로 실행됨.
		System.out.println(Thread.currentThread()); //현재 실행중인 스레드
		t1.start();
		t2.start();
		t3.start();
	}
}
