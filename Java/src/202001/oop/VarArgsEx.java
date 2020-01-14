package oop;

public class VarArgsEx {

	public static void main(String[] args) {
		// 가변인자 사용해보기 
		String[] strArr = {"100", "200", "300"};
		
		System.out.println(concatenate("",strArr));
		System.out.println(concatenate("-", "a", "b", "c"));
		System.out.println(concatenate(",", new String[] {"1", "2", "3"}));
	}
	
	static String concatenate(String dalim, String... args) {
		String result = "";
		
		for (String str: args) {
			result += str + dalim;
		}
		
		return result;
	}

}
