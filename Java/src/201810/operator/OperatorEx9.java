package operator;

public class OperatorEx9 {

	public static void main(String[] args) {
		// 비트 연산자
		int x = 0xAB;
		int y = 0xF;
		
		System.out.printf("x = %#X \t\t %s\n",x, toBinaryString(x));
		System.out.printf("y = %#X \t\t %s\n",y, toBinaryString(y));
		
		System.out.printf("%#X | %#X = %#X \t %s\n",x, y, x|y, toBinaryString(x|y)); // 값을 변경 
		System.out.printf("%#X $ %#X = %#X \t %s\n",x, y, x&y, toBinaryString(x&y)); // 값을 추출
		System.out.printf("%#X ^ %#X = %#X \t %s\n",x, y, x^y, toBinaryString(x^y)); // 비트가 반대로  (암호화)
		
	}
	
	static String toBinaryString(int x) {
		String zero = "0000000000000000000000000000000";
		String tmp = zero + Integer.toBinaryString(x);
		return tmp.substring(tmp.length()-32);
	}

}
