package operator;

public class OperatorEx30 {
	// shift 연산자 연
	public static void main(String[] args) {
		int dec = 8;
		
		System.out.printf("%d >> %d = %4d \t %s%n", dec, 0, dec >> 0, Integer.toBinaryString(dec >> 0));
		System.out.printf("%d >> %d = %4d \t %s%n", dec, 1, dec >> 1, Integer.toBinaryString(dec >> 1));
		System.out.printf("%d >> %d = %4d \t %s%n", dec, 2, dec >> 2, Integer.toBinaryString(dec >> 2));
		
		System.out.printf("%d << %d = %4d \t %s%n", dec, 0, dec << 0, Integer.toBinaryString(dec << 0));
		System.out.printf("%d << %d = %4d \t %s%n", dec, 1, dec << 1, Integer.toBinaryString(dec << 1));
		System.out.printf("%d << %d = %4d \t %s%n", dec, 2, dec << 2, Integer.toBinaryString(dec << 2));
		
		
	}

}
