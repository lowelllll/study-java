package operator;

public class OperatorEx11 {

	public static void main(String[] args) {
		// 쉬프트 연산자
		int dec = 8;
		
		System.out.printf("%d >> %d = %4d \t%s\n", dec, 0, dec >> 0, toBinaryString(dec>>0));
		System.out.printf("%d >> %d = %4d \t%s\n", dec, 1, dec >> 1, toBinaryString(dec>>1));
		System.out.printf("%d >> %d = %4d \t%s\n", dec, 2, dec >> 2, toBinaryString(dec>>2));
		
		System.out.printf("%d << %d = %4d \t%s\n", dec, 0, dec << 0, toBinaryString(dec>>0));
		System.out.printf("%d << %d = %4d \t%s\n", dec, 1, dec << 1, toBinaryString(dec>>1));
		System.out.printf("%d << %d = %4d \t%s\n", dec, 2, dec << 2, toBinaryString(dec>>2));
		
		System.out.println();
		
		dec = -8;
		System.out.printf("%d >> %d = %4d \t%s\n", dec, 0, dec >> 0, toBinaryString(dec>>0));
		System.out.printf("%d >> %d = %4d \t%s\n", dec, 1, dec >> 1, toBinaryString(dec>>1));
		System.out.printf("%d >> %d = %4d \t%s\n", dec, 2, dec >> 2, toBinaryString(dec>>2));
		
		System.out.printf("%d << %d = %4d \t%s\n", dec, 0, dec << 0, toBinaryString(dec>>0));
		System.out.printf("%d << %d = %4d \t%s\n", dec, 1, dec << 1, toBinaryString(dec>>1));
		System.out.printf("%d << %d = %4d \t%s\n", dec, 2, dec << 2, toBinaryString(dec>>2));
		
		dec = 8;
		System.out.printf("%d >> %d = %4d \t%s\n", dec, 0, dec >> 0, toBinaryString(dec>>0));
		System.out.printf("%d >> %d = %4d \t%s\n", dec, 32, dec >> 32, toBinaryString(dec>>32));
		
		
	}
	static String toBinaryString(int x) {
		String zero = "0000000000000000000000000000000";
		String tmp = zero + Integer.toBinaryString(x);
		return tmp.substring(tmp.length()-32);
	}
}
