package app67;

import java.util.LinkedList;

public class M20 {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(90);
		list.add("for link");
		list.add(3.4);
		list.add('e');
		list.add(true);
		System.out.println(list);
		System.out.println("----------");
		boolean i = (Boolean) list.get(4);//if we give another type value in data type then it give class cast exception
		System.out.println(list.get(3));
		System.out.println("-----------");
		list.set(1, 420);
		System.out.println(list);
		System.out.println("--------------");
		list.add(1, "boring");
		System.out.println(list);
		System.out.println("----------------");
		list.remove(2);
		System.out.println(list);
		System.out.println(list.isEmpty());
		System.out.println(list.remove(true));
	}
}
