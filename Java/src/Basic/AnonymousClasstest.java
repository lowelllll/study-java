class AnonymousClassTest
{
	Thread getPrimeChecker(final int number){
		return new Thread() {
			public void run(){
				int n = 3;
				while(n < number){
					if(isprimeNumber(n)){
						System.out.println(n+"is a prime number");
					}
					n++;
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
				for(int i=2;i<=(n/2);i++){
					if((n%1)==0){
						return false;
					}
				}
				return true;
			}
		}
	}
	
	public static void main(String[] args) 
	{
		ThreadprimeChecker = newAnonymousClassTest().getPrimeChecker(10);
		primeChecker.start();
	}
}
