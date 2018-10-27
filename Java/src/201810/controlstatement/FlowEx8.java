package controlstatement;

public class FlowEx8 {

	public static void main(String[] args) {
		// 이름있는 반복문
		Loop1: for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				if(j==5) {
					// break Loop1;
					// break;
					 continue;
				}
				System.out.printf("%d * %d = %d\n",i,j,i*j);
			}
		}
	}

}
