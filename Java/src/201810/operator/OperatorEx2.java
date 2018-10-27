package operator;

public class OperatorEx2 {

	public static void main(String[] args) {
		byte a = 10;
		byte b = 20;
		byte c = (byte)(a*b); // a+b 는 int형 
		// 크기가 작은 자료형의 변수를 큰 자료형의 변수에 저장하는 것은 자동 형변환 되지만
		// 크기가 큰 자료형의 변수를 작은 자료형의 변수에 저장하는 것은 명시적으로 형변환 해야함.
		// 형변환 연산자는 단항 연산자.
		
		System.out.println(c);
	}

}
