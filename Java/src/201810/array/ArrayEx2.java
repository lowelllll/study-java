package array;

public class ArrayEx2 {

	public static void main(String[] args) {
		// 배열 복사
		// for문 , arraycopy()
		char[] abc = {'A','B','C'};
		char[] num = {'0','1','2','3'};
		System.out.println(abc);
		System.out.println(num);
		
		char[] result = new char[abc.length + num.length];
		System.arraycopy(abc, 0, result, 0, abc.length);
		System.arraycopy(num, 0, result, abc.length, num.length);
		System.out.println(result);
	}

}
