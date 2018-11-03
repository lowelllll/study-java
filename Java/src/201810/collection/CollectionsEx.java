package collection;

import java.util.*;
import static java.util.Collections.*; // Collections.method 이렇게 안쓰고 method이렇게 쓸 수 있음
public class CollectionsEx {

	public static void main(String[] args) {
		List list = new ArrayList();
		System.out.println(list);
		
		addAll(list, 1,2,3,4,5);
		System.out.println(list);
		
		rotate(list, 2); //오른쪽으로 2칸 이동
		System.out.println(list);
		
		swap(list, 0, 2); // 첫번째와 세번째를 교환
		System.out.println(list);
		
		shuffle(list);
		System.out.println(list);

		sort(list);
		System.out.println(list);

		sort(list, reverseOrder()); // 역순 정렬  reverse(list)와 동일
		System.out.println(list);
		
		int index = binarySearch(list, 3); // 3이 저장된 위치를 반환
		System.out.println("index of 3 = "+index);
		
		System.out.println("max="+max(list));
		System.out.println("min="+min(list));
		System.out.println("min="+max(list, reverseOrder())); // 낮은 순위로
		
		fill(list, 9); // 리스트를 9로 채움
		System.out.println("list"+list);
		
		List newList = nCopies(list.size(), 2); // list와 같은 크기의 새로운 list 생성, 2로 채움 결과는 변경 불가능
		System.out.println("newList:"+newList);
		
		System.out.println(disjoint(list, newList)); //  공통요소가 없으면 true
		
		copy(list, newList); // list를 newList에 카피
		 
		System.out.println("List:"+list);
		System.out.println("newList:"+newList);
		
		replaceAll(list, 2, 1); // 2를 1로 바꿈
		System.out.println("list="+list);
		
		Enumeration e = enumeration(list);
		ArrayList list2 = list(e); // Collections.list(e);
		
		System.out.println("list2="+list2); // ArrayList
	}

}
