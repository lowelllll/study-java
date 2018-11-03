package collection;

import java.util.*;
public class TreeMapEx1 {

	public static void main(String[] args) {
		String[] data = {"A","K","B","A","A","A","B","D","D","D","A","K","K"};
		
		TreeMap map = new TreeMap();
		
		for(int i=0; i<data.length; i++) {
			if(map.containsKey(data[i])) {
				Integer value = (Integer) map.get(data[i]);
				map.put(data[i], new Integer(value.intValue()+1));
			}else {
				map.put(data[i], new Integer(1));
			}
		}
		
		Iterator it = map.entrySet().iterator();
		
		System.out.println("=기본정렬=");
		while(it.hasNext()) {
			Map.Entry entry = (Map.Entry) it.next();
			int value = ((Integer)entry.getValue()).intValue();
			System.out.println(entry.getKey()+":"+printBar('#',value)+" "+value);
		} // 오름차순 정렬됨. treemap이기 때문
		
		System.out.println();
		
		Set set = map.entrySet();
		List list = new ArrayList(set); // map을 Arraylist로 변환
		
		Collections.sort(list, new ValueComparator());
		
		it = list.iterator();
		
		while(it.hasNext()) {
			Map.Entry entry = (Map.Entry) it.next();
			int value = ((Integer)entry.getValue()).intValue();
			System.out.println(entry.getKey()+":"+printBar('#',value)+" "+value);
		}
		
	}
	
	static class ValueComparator implements Comparator{
		public int compare(Object o1, Object o2) {
			if(o1 instanceof Map.Entry && o2 instanceof Map.Entry) {
				Map.Entry e1 = (Map.Entry) o1;
				Map.Entry e2 = (Map.Entry) o2;
				
				int v1 = ((Integer)e1.getValue()).intValue();
				int v2 = ((Integer)e2.getValue()).intValue();
				return v2 - v1;
				// 값에 대한 내림차순으로 정렬하는 방법
			} 
			return -1;
		}
	}
	
	static String printBar(char ch, int value) {
		char[] bar = new char[value];
		for(int i=0; i<bar.length; i++) {
			bar[i] = ch;
		}
		
		return new String(bar);
	}
}
