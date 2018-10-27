package variable;

public class OverflowEx {

	public static void main(String[] args) {
		short sMin = -32768;
		short sMax = 32767; // 2바이트 최대로 표현할 수 있는 값
		char xMin = 0;
		char xMax = 65535;
		
		System.out.println("sMin = "+sMin);
		System.out.println("sMin-1 = "+(short)(sMin-1));
		System.out.println("sMax = "+sMax);
		System.out.println("sMax+1 = "+(short)(sMax+1));
		System.out.println("cMin =" + (int)xMin);
		System.out.println("cMin-1="+(int)--xMin);
		System.out.println("cMax = "+(int)xMax);
		System.out.println("cMax+1="+(int)++xMax);
		// 최소값 + 1 = 최대값
		// 최대값 - 1 = 최소값
	}

}
