package operator;

public class OperatorEx3 {

	public static void main(String[] args) {
		long a = 1000000 * 1000000; // int * int = int 
		long b = 1000000 * 1000000L; // int * long = long
		
		System.out.println("a = "+a); // overflow! 
		System.out.println("b = "+b);
	}

}
