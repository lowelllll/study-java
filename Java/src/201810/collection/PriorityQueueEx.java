package collection;
// 우선순위 큐
import java.util.*;

public class PriorityQueueEx {

	public static void main(String[] args) {
		Queue pq = new PriorityQueue();
		pq.offer(1); // pq.offer(new Integer(1)); 오토박싱
		pq.offer(3);
		pq.offer(4);
		pq.offer(0);
		pq.offer(2);
		System.out.println(pq);
		
		Object obj = null;
		while((obj = pq.poll()) != null) {
			System.out.println(obj);
		}
		
	}

}
