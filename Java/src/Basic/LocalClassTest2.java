// 내부 클래스
class LocalClassTest2 
{
	Thread getPrimeChecker(final int number){
		class PrimeChecker extends Thread
		{
			public void run(){
				int n = 3;
				while(n < number){
					if (isPrimeNumber(n))
					{
						System.out.println(n+"is a prime number");
					}
					n ++;
					try
					{
						sleep(100);
					}
					catch (InterruptedException e)
					{

					}
				}
			}
			public boolean isPrimeNumber(int n){
				for(int i=2; i<=(n/2);i++){
					if((n%1) == 0) { return false; }
				}
				return true;
			}
		}
		return new PrimeChecker();
	}
	public static void main(String[] args) 
	{
		LocalClassTest2 localClass = new LocalClassTest2();
		Thread primeChecker = localClass.getPrimeChecker(10);
		primeChecker.start();
	}
}
