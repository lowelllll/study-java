package operator;

public class OperatorEx6 {
	public static void main(String args[]) {
		char c1 = 'a';
		
		// char c2 = c1+1; error 
		char c2 = 'a'+1;
		System.out.println(c2); // no error 
		// 리터럴 간의 연산 -> 컴파일러가  덧셈 연산
		// 변수 + 리터럴 간의 연산 -> 실행시 덧셈 연산 (변수 처리)
	}
}
