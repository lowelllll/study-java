// final 변수(상수)

import java.util.*;
class MenuClass
{
	final static int MENU_MIN = 0; // final로 선언된 클래스 변수
	final static int MENU_EXIT = 0;
	final static int MENU_INSERT =1;
	final static int MENU_DELETE = 2;
	final static int MENU_SEARCH = 3;
	final static int MENU_UPDATE = 4;
	final static int MENU_MAX =  4;
	// C,C++ 에서 제공하는 enum 형 사용 가능

	final static String[] menuStr = {"Exit","Insert","Delete","Search","Update"};
	final static boolean validMenu(int i){
		return (i >= MENU_MIN) && (i<=MENU_MAX); 
	}

	final static void printMenu (){
		System.out.println("[1] Insert \n [2] Delete \n [3] Search \n [4] Update\n\n [0] Exit");
	}
}
class  EnumVarTest
{
	public static void main(String[] args) 
	{
			Scanner sc = new Scanner (System.in);
			int menu;
			for(;;){
				do{
					MenuClass.printMenu();
					menu = sc.nextInt();  //- '0' // String -> int ascii 
				}while(!MenuClass.validMenu(menu));
				System.out.println("Select menu :" + MenuClass.menuStr[menu] );
				if (menu == MenuClass.MENU_EXIT) break;
		}
	}
}
