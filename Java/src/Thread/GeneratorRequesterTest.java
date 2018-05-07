import java.lang.Thread;
class SharedData
{
	private int data;
	private boolean avaliable = false;
	public synchronized int get(){
		while(avaliable == false){
			try{
				wait();
			}catch(InterruptedException e){}
		}
		avaliable = false;
		notifyAll();
		return data;
	}

	public synchronized void put(int value){
		while(avaliable == true){
			try{
				wait();
			}
			catch (InterruptedException e){
			}
			data = value;
			avaliable = true;
			notifyAll();
		}
	}
}

class Generator extends Thread
{
	private SharedData sharedData;
	public Generator(SharedData data, int id){
		sharedData = data;
		setName("Generator-"+id);
	}
	public void run(){
		int i;
		while(true){
			i = (int)(Math.random()*100);
			System.out.println(getName()+" put:"+i);
			sharedData.put(i);
			try{
				sleep((int)(Math.random() * 200));
			}catch(InterruptedException e){}
		}
	}
}

class Requester extends Thread
{
	private SharedData sharedData;
	public Requester(SharedData c,int id){
		this.sharedData = c;
		setName("Requester-"+id);
	}
	public void run(){
		while(true){
			System.out.println(getName()+" get:"+sharedData.get());
		}
	}
}

class GeneratorRequesterTest
{
	public static void main(String[] args) 
	{
		SharedData c = new SharedData();
		Generator gen = new Generator(c,1);
		Requester req = new Requester(c,1);
		gen.start();
		req.start();
		try{
			Thread.sleep(3000);
		}
		catch (InterruptedException e)
		{
		}
		gen.stop();
		req.stop();
	}
}
