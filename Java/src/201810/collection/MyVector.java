package collection;

import java.util.*;
public class MyVector implements List{
	Object[] data = null; // 객체를 담기 위한 객체배열
	int capacity = 0;
	int size = 0;
	
	public MyVector(int capacity) {
		if (capacity < 0) {
			throw new IllegalArgumentException("유효하지 않은 값입니다:"+capacity);
		}
		
		this.capacity = capacity;
		data = new Object[capacity];
 	}
	
	public MyVector() {
		this(10); // 크기를 지정하지 않을 시 크기는 10
	}
	
	public void ensureCapacity(int minCapacity) {
		if(minCapacity - data.length > 0) {
			setCapacity(minCapacity);
		}
	}
	
	public boolean add(Object obj) {
		ensureCapacity(size+1);
		data[size++] = obj;
		return true;
	}
	
	public Object get(int index) {
		if (index<0 || index>= size)
			throw new IndexOutOfBoundsException("범위를 벗어났습니다.");
		return data[index];
	}
	
	public Object remove (int index) {
		Object oldObj = null;
		
		if (index<0 || index>= size)
			throw new IndexOutOfBoundsException("범위를 벗어났습니다.");
		oldObj = data[index];
		
		if(index != size-1) {
			// 삭제하고자 하는 객체가 마지막 객체가 아니라면 배열 복사를 통해 빈자리를 채워줌
			System.arraycopy(data, index+1, data, index, size-index-1);
		}
		
		data[size-1] = null;
		size --;
		return oldObj;
	}
	
	public boolean remove(Object obj) { // 오버로딩
		for(int i=0; i<size; i++) {
			if(obj.equals(data[i])) {
				remove(i);
				return true;
			}
		}
		return false;
	}
	
	public void trimToSize() {
		setCapacity(size);
	}
	
	private void setCapacity(int capacity) {
		if (this.capacity == capacity) return;// 크기가 같으면 변경하지 않음
		Object[] tmp = new Object[capacity];
		System.arraycopy(data, 0, tmp, 0, size);
		data = tmp;
		this.capacity = capacity;
	}
	
	public void clear() {
		for(int i=0; i<size; i++) {
			data[i] = null;
		size = 0;
		}
	}
	
	public Object[] toArray() {
		Object[] result = new Object[size];
		System.arraycopy(data, 0, result, 0, size);
		
		return result;
	}
	
	public boolean isEmpty() { return size==0; }
	public int capacity() { return capacity; }
	public int size() {return size;}

	@Override
	public void add(int index, Object element) {
		// TODO Auto-generated method stub
		ensureCapacity(size+1);
		
	}

	@Override
	public boolean addAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(int index, Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		for(int i=0; i<data.length; i++) {
			if(o.equals(data[i])) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean containsAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int indexOf(Object o) {
		for(int i=0; i<data.length; i++) {
			if(o.equals(data[i])){
				return i;
			}
		}
		return -1;
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		for(int i=data.length-1; i>=0; i--) {
			if(o.equals(data[i])){
				return i;
			}
		}
		return -1;
	}

	@Override
	public ListIterator listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIterator listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean removeAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object set(int index, Object element) {
		// TODO Auto-generated method stub
		data[index] = element;
		return data[index];
	}

	@Override
	public List subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray(Object[] a) {
		// TODO Auto-generated method stub
		return null;
	}

}
