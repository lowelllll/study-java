package controlstatement;

public class FlowEx4 {

	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50};
		int sum = 0;
		for(int num:arr) {
			sum += num;
			System.out.println(num);
		}
		System.out.println(sum);
 	}

}
