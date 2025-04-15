package app68;

import java.util.LinkedList;

public class M2 {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(1000);
		list.add(2000);
		list.add(3000);
		list.add(4000);
		list.add(5000);
		list.add(6000);
		list.add(7000);
		list.add(8000);
		list.add(9000);
		System.out.println(list);
		System.out.println(list.poll());
		System.out.println(list);
		System.out.println(list.pollFirst());
		System.out.println(list);
		System.out.println(list.pollLast());
		System.out.println(list);
	}
}
//poll method is used for the both reading and removing the element 