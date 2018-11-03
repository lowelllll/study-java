package collection;

import java.util.Vector;

public class VectorEx1 {

	public static void main(String[] args) {
		// Vector의 용량(capacity)와 크기(size)
		Vector v = new Vector(5); // 용량이 5인 vector
		v.add("1");
		v.add("2");
		v.add("3");
		print(v);
		
		v.trimToSize(); // 빈 공간을 없앰 (용량과 크기가 같아짐)
		System.out.println("===After trimTosize()===");
		print(v);
		
		v.ensureCapacity(6);
		System.out.println("===After ensureCapacity(6)===");
		print(v);
		
		v.setSize(7);
		System.out.println("===After setSize(7)===");
		print(v);
		
		v.clear();
		System.out.println("===After clear()===");
		print(v);
		
	}
	public static void print(Vector v) {
		System.out.println(v);
		System.out.println("size:"+v.size());
		System.out.println("capacity:"+v.capacity());
	}

}
