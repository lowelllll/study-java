package collection;

import java.util.*;
public class TreeSetLotto {

	public static void main(String[] args) {
		Set set = new TreeSet();
		
		for(int i=0; set.size()<6; i++) {
			int num = (int)(Math.random()*45)+1;
			set.add(num); // set.add(new Integer(num));
		}
		
		System.out.println(set); // 트리이기때문에 이미 정렬되어있음.
	}

}
