package app68;

import java.util.PriorityQueue;

public class M4 {
	public static void main(String[] args) {
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		queue.add(1000);
		queue.add(100);
		queue.add(4000);
		queue.add(10);
		queue.add(6000);
		queue.add(2000);
		queue.add(3000);
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);
	}
}
//priority queue is a autoSorting but it doesn't require the sorting
//b/c in queue the first element is guarantees sorted and remaining is not required the sorting