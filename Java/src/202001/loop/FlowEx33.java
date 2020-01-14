package loop;

public class FlowEx33 {

	public static void main(String[] args) {
		// 이름이 있는 루프 
		Loop1: for (int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				if (j == 5) {
					break Loop1;
				}
				System.out.printf("%d * %d = %d%n", i, j, i*j);
			}
		}
	}

}
