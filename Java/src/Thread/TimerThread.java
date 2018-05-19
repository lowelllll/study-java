import java.lang.Thread;

class  Timer extends Thread
{
	private int count = 0;
	Timer(int i){
		this.count = i;
	}

	public void run(){
		System.out.println("타이머를 시작합니다.");
		while(this.count>0){
			System.out.println(this.count--);
			try{
				sleep(1000);
			}catch(InterruptedException e){
				
			}
		}
		System.out.println("타이머 종료");
	}
}

class TimerThread
{
	public static void main(String args[]){
		int count;
		if (args.length > 0)
		{
			count = Integer.parseInt(args[0]);
		}else {
			System.out.println("타이머 시간을 입력하세요");
			return;
		}

		Timer timer = new Timer(count);
		timer.start();
	}
}