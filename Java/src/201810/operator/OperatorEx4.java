package operator;

public class OperatorEx4 {

	public static void main(String[] args) {
		// char형 숫자를 int형 숫자로 변경하는 법
		char two = '2'; // 50
		char zero = '0'; // 48
		
		System.out.printf("'%c'-'%c' = %d\n",two,zero, two-zero); // 자동 형변환 two-zero = 50 - 48 
		
		// 알파벳 차이 알아내기
		char c = 'c';
		char a = 'a';
		System.out.printf("'%c' - '%c' = %d", c,a,c-a);
		
	}

}
