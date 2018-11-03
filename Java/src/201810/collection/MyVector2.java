package collection;

import java.util.*;
public class MyVector2 extends MyVector implements Iterator {
	int cursor = 0; // 앞으로 올 요소의 위치
	int lastret = -1; // 마지막으로 읽은 요소의 위치
	
	public MyVector2(int capacity) {
		super(capacity);
	}
	
	public MyVector2() {
		this(10);
	}
	
	public String toString() {
		String tmp = "";
		Iterator it = iterator();
		
		for(int i=0; it.hasNext(); i++) {
			if(i!=0) tmp+= ",";
			tmp+= it.next();
		}
		
		return "["+tmp+"]";
	}
	
	public Iterator iterator() {
		cursor = 0;
		lastret = -1;
		return  this;
	}
	
	@Override
	public boolean hasNext() {
		return cursor != size();
	}
	
	@Override
	public Object next() {
		// TODO Auto-generated method stub
		Object next = get(cursor);
		lastret = cursor++;
		return next;
	}
	
	public void remove() {
		if(lastret == -1) {
			throw new IllegalStateException();
		} else {
			remove(lastret);
			cursor --; // 커서의 위치 감소
			lastret = -1; // lastret 값 초기화
		}
	}

}
