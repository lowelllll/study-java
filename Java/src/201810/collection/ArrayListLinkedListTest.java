package collection;


import java.util.*;

public class ArrayListLinkedListTest {
	public static void main(String args[]) {
		ArrayList al = new ArrayList(20000000);
		LinkedList ll = new LinkedList();
		
		System.out.println("===순차적으로추가===");
		System.out.println("ArrayList:"+add1(al));
		System.out.println("LinkedList:"+add1(ll));

		System.out.println("===중간에 추가===");
		System.out.println("ArrayList:"+add2(al));
		System.out.println("LinkedList:"+add2(ll));

		System.out.println("===순차적으로삭제 ===");
		System.out.println("ArrayList:"+remove1(al));
		System.out.println("LinkedList:"+remove1(ll));

		System.out.println("===중간에서 삭제===");
		System.out.println("ArrayList:"+remove2(al));
		System.out.println("LinkedList:"+remove2(ll));
	}
	
	public static long add1(List list) {
		long start = System.currentTimeMillis();
		for(int i=0; i<100000; i++) list.add(i+""); // 자식 클래스의 오버라이딩된 메소드 호출
		long end = System.currentTimeMillis();
		return end-start;
	}
	
	public static long add2(List list) {
		long start = System.currentTimeMillis();
		for(int i=0; i<10000; i++) list.add(500,"X"); // 자식 클래스의 오버라이딩된 메소드 호출
		long end = System.currentTimeMillis();
		return end-start;
	}
	
	public static long remove1(List list) {
		long start = System.currentTimeMillis();
		for(int i=list.size()-1; i>=0; i--) list.remove(i); 
		long end = System.currentTimeMillis();
		return end-start;
	}
	
	public static long remove2(List list) {
		long start = System.currentTimeMillis();
		for(int i=0; i<100; i++) list.remove(i); 
		long end = System.currentTimeMillis();
		return end-start;
	}
}
