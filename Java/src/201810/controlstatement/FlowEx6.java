package controlstatement;

public class FlowEx6 {
	public static void main(String args[]) {
		int num = 0;
		int sum = 0;
		
		while((sum += ++num) <= 100) {
			System.out.printf("%d - %d \n",  num,sum);
			
		}
	}
}
