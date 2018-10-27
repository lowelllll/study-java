package controlstatement;

import java.util.Scanner;

public class FlowEx5 {

	public static void main(String[] args) {
		int num = 0;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요>");
		
		num = Integer.parseInt(sc.nextLine());
		
		while(num!=0) {
			sum += num % 10;
			System.out.printf("sum = %d, num = %d\n",sum, num);
			num = num / 10;
		}
		
		System.out.println(sum);
	
	}

}
