package app68;

import java.util.Collections;
import java.util.PriorityQueue;

public class M5 {
	public static void main(String[] args) {
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>(Collections.reverseOrder());
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
//use of Collections.reverseOrder() in queue so 
//it reverse means give the descending order of value(top means maximum)