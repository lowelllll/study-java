package variable;

public class FloatEx1 {

	public static void main(String[] args) {
		float f = 9.12345678901234567890f;
		float f2 = 1.2345678901234567890f;
		double d = 9.12345678901234567890;
		
		System.out.printf("    1234567890123456789012345%n");
		System.out.printf("f:   %f%n", f); // 7자리에서 반올림 (기본적으로 소수점이하 6자릮자ㅣ만 출력함 )
		System.out.printf("f:   %24.20f%n", f); // 전체 24자리 중에서 20자리는 소수점 이하의 수를 출력하라. 정밀도떨어
		System.out.printf("f2:   %24.20f%n", f2);
		System.out.printf("d:   %24.20f%n", d);
	}

}
