package operator;

public class OperatorEx10 {

	public static void main(String[] args) {
		byte p = 10;
		byte n =  -10;
		
		System.out.printf("p = %d \t %s\n", p, toBinaryString(p));
		System.out.printf("~p = %d \t %s\n", ~p, toBinaryString(~p));
		System.out.printf("~p+1 = %d \t %s\n", ~p+1, toBinaryString(~p+1));
		System.out.printf("~~p = %d \t %s\n", ~~p, toBinaryString(~~p));
		System.out.println();
		
		//  음의 정수 -> 양의 정수 2진수
		System.out.printf("n = %d \t %s\n", n, toBinaryString(n));
		System.out.printf("~(n-1) = %d \t %s\n", ~(n-1), toBinaryString(~(n-1)));
	}
	static String toBinaryString(int x) {
		String zero = "0000000000000000000000000000000";
		String tmp = zero + Integer.toBinaryString(x);
		return tmp.substring(tmp.length()-32);
	}

}
