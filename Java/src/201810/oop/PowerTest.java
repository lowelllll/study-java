package oop;

public class PowerTest {
	// 재귀함수
	public static void main(String[] args) {
		int x = 2;
		int n = 5;
		long result = 0L;
		
		for(int i=1; i<=n; i++) {
			result += power(x, i);
			// 2^1 + 2^2 + 2^3+ 2^4+ 2^5
		}
		System.out.println(result);
	}
	
	static long power(int x, int n) {
		if(n==1) return x;
		return x * power(x, n-1);
	}

}
