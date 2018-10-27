package operator;

public class OperatorEx8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 6;
		System.out.printf("x=%2d, x%%2==0 || x %% 3 == 0 && x%%6!=0 = %b\n", x, x % 2==0||x % 3==0 && x % 6!=0);
		System.out.printf("x=%2d, (x%%2==0 || x %% 3) == 0 && x%%6!=0 = %b\n", x, (x%2==0||x%3==0)&&x%6!=0);
		
	}

}
