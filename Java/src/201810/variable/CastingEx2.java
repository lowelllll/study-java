package variable;

public class CastingEx2 {
	public static void main(String args[]) {
		int i = 10;
		byte b = (byte)i;
		System.out.printf("[int -> byte] i = %d -> b = %d%n",i,b); // 큰 타입에서 작은타입
		
		i = 300;
		b = (byte)i;
		System.out.printf("[int -> byte] i = %d -> b = %d%n",i,b); // 값 손실
		
		b = 10;
		i = (int)b;
		System.out.printf("[byte -> int] b = %d -> i = %d%n",b,i); // 작은타입에서 큰 타입
		
		b = -2;
		i = (int)b;
		System.out.printf("[byte -> int] b = %d -> i = %d%n",b,i);
		
		System.out.println(Integer.toBinaryString(i));
	}
}
