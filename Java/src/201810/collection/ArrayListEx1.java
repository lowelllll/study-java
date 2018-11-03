package collection;

import java.util.*;

public class ArrayListEx1 {

	public static void main(String[] args) {
		ArrayList list1 = new ArrayList(10);
		list1.add(new Integer(5));
		list1.add(new Integer(4));
		list1.add(new Integer(3));
		list1.add(new Integer(0));
		list1.add(new Integer(2));
		list1.add(new Integer(1));
		
		ArrayList list2 = new ArrayList(list1.subList(1, 4)); // list1.get(1)~ list1.get(4-1) 
		print(list1,list2); 
		
		Collections.sort(list1);
		Collections.sort(list2);
		
		print(list1,list2);
		
		System.out.println("list1.containsAll(list2):"+list1.containsAll(list2));
		
		list2.add("B");
		list2.add("C");
		list2.add(3, "A");
		print(list1, list2);
		
		// list1에서 list2와 겹치는 부분만 남기고 나머지는  삭제
		System.out.println("list1.retainAll(list2):"+list1.retainAll(list2)); 
		
		print(list1, list2);
		
		// list2에서 list1에 포함된 객체들을 삭제함.
		for(int i=list2.size()-1; i>=0; i--) { // 앞에서 부터 삭제하면 자리이동이 발생하기 때문에 뒤에서 부터 삭제함
			if(list1.contains(list2.get(i))) {
				list2.remove(i);
			}
		}
		
		print(list1, list2);
	}
	
	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1:"+list1);
		System.out.println("list2:"+list2);
		System.out.println();
	} 
}
