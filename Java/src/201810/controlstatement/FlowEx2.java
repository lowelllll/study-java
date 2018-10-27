package controlstatement;

import java.util.Scanner;

public class FlowEx2 {

	public static void main(String[] args) {
		char gender;
		String regNo = "";
		Scanner sc = new Scanner(System.in);
		
		System.out.println("당신의 주민번호를 입력하세요 > ");
		
		regNo = sc.next();
		gender = regNo.charAt(7);
		
		switch(gender) {
			case '1':
			case '3':
				System.out.println("남자");
				break;
			case '2':
			case '4':
				System.out.println("여자");
				break;
		}
	}

}
