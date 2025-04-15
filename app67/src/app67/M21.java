package app67;

import java.util.LinkedList;

public class M21 extends LinkedList{
	public static void main(String[] args) {
		M21 list = new M21();
		list.add(48);
		list.add(4.5);
		list.add(false);
		list.add('y');
		list.add("for practice");
		System.out.println(list);
//		list.removeRange(1, 3);//it used to remove the particular range of the list 
//		System.out.println(list);
		System.out.println("-----------");
		LinkedList list2 = new LinkedList();
		list2.add("pagal");
		list2.add(63);
		list2.add(true);
		list2.add(4.5);
		list2.add('a');
		System.out.println(list2);
		list2.add(list);
		System.out.println(list);
		System.out.println(list2);
		System.out.println("--------------");
		list.removeAll(list2);
		System.out.println(list);
		System.out.println(list2);
		System.out.println("-----------------");
//		list.retainAll(list2);//use this we remove element which are not available in list2
//		System.out.println(list);
//		System.out.println(list2);
		System.out.println(list.contains("false"));
		System.out.println(list2.contains('a'));
		System.out.println(list.contains(43));
		System.out.println(list);
		System.out.println(list2);
	}
}
