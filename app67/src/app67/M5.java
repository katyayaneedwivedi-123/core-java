package app67;

import java.util.ArrayList;
import java.util.Collection;

public class M5 {
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		list1.add("abc");
		list1.add(45);
		list1.add(5.5);
		list1.add(true);
		System.out.println(list1);
		list1.add(2, 'r');
		System.out.println(list1);
		System.out.println("------------");
		
		ArrayList list2 = new ArrayList();
		list2.add("nhi");
		list2.addAll(list1);
		System.out.println(list2);
		System.out.println("------------");
		list2.remove(1);
		System.out.println(list2);
		System.out.println("------------");
	}
}
