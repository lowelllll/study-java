package controlstatement;

import java.util.Scanner;

public class FlowEx9 {

	public static void main(String[] args) {
		int menu = 0;
		int num = 0;
		 
		Scanner sc = new Scanner(System.in);
		
		outer:
			while(true) {
				System.out.println("(1) square");
				System.out.println("(2) square root");
				System.out.println("(3) log");
				System.out.print("원하는 메뉴를 선택하세요(종료:0)>");
				
				String tmp = sc.nextLine();
				menu = Integer.parseInt(tmp);
				
				if(menu == 0) {
					System.out.println("시스템을 종료합니다");
					break;
				}else if(!(menu >= 1 && menu <=3)){
					System.out.println("메뉴를 잘못 선택하셨습니다. (종료는 0)");
					continue;
				}
				
				for(;;) {
					System.out.print("계산할 값을 입력하세요 (계산종료:0 전체종료:99)> ");
					tmp = sc.nextLine();
					num = Integer.parseInt(tmp);
					
					if(num==0)
						break;
					else if(num==99)
						break outer;
					
					switch(menu) {
					case 1:
						System.out.println("result="+num*num);
						break;
					case 2:
						System.out.println("result="+Math.sqrt(num));
						break;
					case 3:
						System.out.println("result="+Math.log(num));
						break;
						
					}
				}
			}
	}

}
