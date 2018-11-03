package collection;

import java.util.*;
public class ListIteratorEx1 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		ListIterator it = list.listIterator(); // 양방향으로 접근 가능한 iterator
		
		while(it.hasNext()) {
			System.out.print(it.next());
		}
		
		System.out.println();
		
		while(it.hasPrevious()) {
			System.out.print(it.previous());
		} //역방향으로 진행하며 읽어옴
		
	}

}
