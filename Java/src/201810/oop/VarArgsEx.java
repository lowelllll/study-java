package oop;

public class VarArgsEx {

	public static void main(String[] args) {
		String[] strArr = {"100","200","300"};
		
		System.out.println(concatenate("", "100","200","300"));
		System.out.println(concatenate("-", strArr));
		System.out.println(concatenate(",", new String[] {"1","2","3"}));
		System.out.println("["+concatenate(",", new String[0])+"]");
		System.out.println("["+concatenate(",")+"]");
	}
	
	static String concatenate(String delim, String... args) { // 가변인자 사용
		// 가변인자를 사용하면 오버로딩되는 메소드가 구분되지 않아 오류가 발생할 수 있음.
		// 가변인자를 사용한 메서드는 오버로딩하지 않는게 좋음.
		String result = "";
		
		for(String str:args) {
			result += str + delim;
		}
		
		return result;
	}

}
