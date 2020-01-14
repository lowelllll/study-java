package exception;

public class ChaineExceptionEx {

	public static void main(String[] args) {
		try {
			install();
		} catch (InstallException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	static void install() throws InstallException {
		try {
			startInstall();
			copyFiles();
		} catch (SpaceException e) {
			// TODO: handle exception
			InstallException ie = new InstallException("설치중 예외 발생.");
			ie.initCause(e); // 예외 연결
			throw ie;
		} catch (MemoryException me) {
			InstallException ie = new InstallException("설치중 예외 발생. ");
			ie.initCause(me);
			throw ie;
		} finally {
			deleteTempFiles();
		}
	}
	
	static void startInstall() throws SpaceException, MemoryException {
		if(!enoughSpace()) 
			throw new SpaceException("설치할 공간이 부족합니다..");
		if(!enoughMemory())
			throw new MemoryException("메모리가 부족합니다..");
//			throw new RuntimeException(new MemoryException("메모리가 부족합니다.."));
		
	}
	
	static void copyFiles() {}
	static void deleteTempFiles() {}
	
	static boolean enoughSpace() { return false; }
	static boolean enoughMemory() { return true; }

}

class InstallException extends Exception{
	InstallException (String msg) {
		super(msg);
	}
}


