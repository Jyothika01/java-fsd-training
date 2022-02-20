package ds_15;
import java.util.*;
public class Priorityqueue {
	public static void main(String[] args)
	{
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		pq.add(12);
		pq.add(67);
		pq.add(78);
		pq.add(45);
		pq.add(33);
		System.out.println("Priority Queue is" +pq);
		System.out.println("head of  the queue s" +pq.peek());
		System.out.println("size of  the queue s" +pq.size());
		boolean removed = pq.remove(78); 
		System.out.println("removed");    
		pq.poll();
		System.out.println("Priority Queue is" +pq);
		System.out.println("is priority Queue empty" +pq.isEmpty());
	}

}
