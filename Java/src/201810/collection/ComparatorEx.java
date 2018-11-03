package collection;

import java.util.*;
public class ComparatorEx {

	public static void main(String[] args) {
		String[] strArr = {"cat","Dog","lion","tiger"};
		
		Arrays.sort(strArr);
		System.out.println("strArr="+Arrays.toString(strArr));

		Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER); // 대소문자 구분안하는 정렬
		System.out.println("strArr="+Arrays.toString(strArr));

		Arrays.sort(strArr, new Desending()); // 역순
		System.out.println("strArr="+Arrays.toString(strArr));
	}
}

class Desending implements Comparator{ // 정렬에 필요한 메서드를 정의하는 comparator
	public int compare(Object o1, Object o2) {
		if (o1 instanceof Comparable && o2 instanceof Comparable) {
			Comparable c1 = (Comparable) o1; // Comparable 기본 정렬 기준을 구현하는데 사용
			Comparable c2 = (Comparable) o2;  // comparator 기본 정렬 기준 외에 다른 기준으로 정렬하고자 할 때 사용함.
			return c1.compareTo(c2) * -1; // 기본 정렬 방식의 역으로 변경
		}
		return -1;
	}
}
