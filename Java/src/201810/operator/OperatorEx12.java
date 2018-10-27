package operator;

public class OperatorEx12 {

	public static void main(String[] args) {
		int dec = 1234;
		int hex = 0xABCD;
		int mask = 0xF;
		
		System.out.printf("hex=%X\n", hex);
		System.out.printf("%X\n", hex & mask);
		
		hex = hex >> 4;
		System.out.printf("%X\n", hex & mask);
		
		hex = hex >> 4;
		System.out.printf("%X\n", hex & mask);
		
		hex = hex >> 4;
		System.out.printf("%X\n", hex & mask);
		
	}
	static String toBinaryString(int x) {
		String zero = "0000000000000000000000000000000";
		String tmp = zero + Integer.toBinaryString(x);
		return tmp.substring(tmp.length()-32);
	}
}
