package controlstatement;

import java.util.Scanner;

public class FlowEx7 {

	public static void main(String[] args) {
		int input = 0;
		int answer = 0;
		
		answer = (int)(Math.random() * 100) + 1; // 1 ~ 100
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("1과 100사이 정수를 입력하세요>");
			
			String tmp = sc.nextLine();
			input = Integer.parseInt(tmp);
			
			if(input > answer) {
				System.out.println("더 작은 수로 다시 도전해보세용");
			}else if(input < answer){
				System.out.println("더 큰 수로 다시 도전해보세용");
			}
		}while(input != answer);
		
		System.out.println("정답!");
			
	}

}
