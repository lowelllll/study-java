package operator;

public class OperatorEx5 {

	public static void main(String[] args) {
		char c1 = 'a';
		char c2 = c1;
		char c3 = ' ';
		
		int i = c1 + 1; // int형으로 자동 형변환 97 + 1 = 98
		
		c3 = (char) (c1 + 1); // 명시적 형변환으로  98을 char형으로 변형 = b
		c2++; // 98
		c2++; // 99
		
		System.out.println("i ="+i);
		System.out.println("c2="+c2);
		System.out.println("c3="+c3);
	}

}
