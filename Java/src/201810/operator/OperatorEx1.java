package operator;

public class OperatorEx1 {

	public static void main(String[] args) {
		int a = 10;
		int b = 4; 
		 
		System.out.printf("%d + %d = %d\n",a,b,a+b);
		System.out.printf("%d - %d = %d\n",a,b,a-b);
		System.out.printf("%d * %d = %d\n",a,b,a*b);
		System.out.printf("%d / %d = %d\n",a,b,a/b); // 버림
		
		System.out.printf("%d / %.2f = %.2f\n",a, (float)b, a / (float)b); // a는 자동 형변환 (float)
	}

}
