package oop;

class Product {
	static int count = 0; // 클래스 변수
	int serialNo = 0;
	
	// 인스턴스 초기화 블럭
	{
		++count;
		serialNo = count;
	}
	
}
public class ProductTest {
	
	public static void main(String[] args) {
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		
		System.out.printf("p1의 제품번호는 %d\n", p1.serialNo);
		System.out.printf("p2의 제품번호는 %d\n", p2.serialNo);
		System.out.printf("p3의 제품번호는 %d\n", p3.serialNo);
		System.out.println("생산된 제품의 수는 모두"+Product.count+"입니다.");
	}

}
