package operator;

public class OperatorEx7 {

	public static void main(String[] args) {
		// 소문자 대문자로 변경하기
		char lowerCase = 'a';
		char upperCase = (char)(lowerCase-32);
		
		System.out.println(upperCase);
	}

}
