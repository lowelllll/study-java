package exception;

public class NewExceptionTest {

	public static void main(String[] args) {
		try {
			startInstall();
			copyFiles();
		} catch (SpaceException e) {
			System.out.println("error msg: "+e.getMessage());
			e.printStackTrace();
			System.out.println("공간을 확보한 뒤 다시 설치하세");
		} catch (MemoryException e) {
			System.out.println("error msg: "+e.getMessage());
			e.printStackTrace();
//			System.gc(); // garbage collection 수행...
			System.out.println("다시 설치하세");
		} finally {
			deleteTempFiles(); // 임시 파일 삭제 
		}
	}
	
	static void startInstall() throws SpaceException, MemoryException {
		if(!enoughSpace()) 
			throw new SpaceException("설치할 공간이 부족합니다..");
		if(!enoughMemory())
			throw new MemoryException("메모리가 부족합니다..");
		
	}
	
	static void copyFiles() {}
	static void deleteTempFiles() {}
	
	static boolean enoughSpace() { return false; }
	static boolean enoughMemory() { return true; }

}

class SpaceException extends Exception {
	SpaceException (String msg) {
		super(msg); // Exception클래스의 생성자 호출 
	}
}

class MemoryException extends Exception {
	MemoryException (String msg) {
		super(msg);
	}
}
