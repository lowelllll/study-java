package collection;

import java.util.*;
public class StackQueueEx {

	public static void main(String[] args) {
		Stack stack = new Stack();
		Queue q = new LinkedList(); // Queue는 인터페이스로만 구현되어있음.
		
		stack.push("0");
		stack.push("1");
		stack.push("2");
		
		q.offer("0");
		q.offer("1");
		q.offer("2");
		
		System.out.println("=Stack=");
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
		
		System.out.println("=Queue");
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}
	}

}
