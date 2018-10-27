package exception;

public class ExceptionEx1 {

	public static void main(String[] args) {
		try {
			Exception e = new Exception("고의로 발생");
			throw e;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("프로그램 정상 종료");
	}

}
