package controlstatement;

import java.util.Scanner;

public class FlowEx1 {
	 // switch문 연습
	public static void main(String[] args) {
		int month = 0;
		
		System.out.println("현재 월을 입력하세요 >");
		
		Scanner sc = new Scanner(System.in);
		String tmp = sc.nextLine();
		month = Integer.parseInt(tmp);
		
		// break를 쓰지 않으면 케이스 조건이 맞은 이후로 밑의 조건들을 모두 실행.
		switch(month) {
			case 3:
			case 4:
			case 5:
				System.out.println("현재 계절은 봄입니다!");
				break;
			case 6: case 7: case 8:
				System.out.println("현재 계절은 여름입니다!");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("현재 계절은 가을입니다!");
				break;
			default:
				System.out.println("현재 계절은 겨울입니다!");
		}
	}

}
