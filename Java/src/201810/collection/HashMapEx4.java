package collection;

import java.util.*;
public class HashMapEx4 {
	
	public static void main(String[] args) {
		String[] data = {"A","B","C","D","A","A","C","D","C","A","Z","D","A"};
		
		HashMap map = new HashMap();
		
		for(int i=0; i< data.length; i++) {
			if(map.containsKey(data[i])) {
				Integer value = (Integer)map.get(data[i]);
				map.put(data[i], new Integer(value.intValue()+1));
			}else {
				map.put(data[i], new Integer(1));
			}
		}
		
		Iterator it = map.entrySet().iterator();
		
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry) it.next();
			int value = ((Integer) e.getValue()).intValue();
			System.out.println(e.getKey()+":"+printBar('*', value)+" "+value);
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
