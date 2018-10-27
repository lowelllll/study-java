package operator;
import java.util.*;
public class OperationEx9 {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			char ch = ' ';
			
			System.out.println("문자 하나 입력하세요>");
			
			String input = sc.nextLine();
			ch = input.charAt(0);
			
			if('0'<=ch && ch<='9') {
				System.out.println("입력하신 문자는 숫자입니다.");
			}else if('a'<=ch && ch <= 'z') {
				System.out.println("입력하신 문자는 영문자입니다.");
			}
	}

}
