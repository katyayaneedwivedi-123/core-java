package app67;

import java.util.ArrayList;

public class M7 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(10000);
		list.add("abc");
		list.add(8.7);
		list.add('e');
		list.add(false);
		System.out.println(list);
		System.out.println(list.remove(3));
		System.out.println(list);
		System.out.println(list.remove("abc"));
		System.out.println(list);
		System.out.println(list.remove("xyz"));
		System.out.println(list);
	}
}
//in this first index remove remove this and return this index value
//and second index value remove this abc and returning the true
//and third remove xyz is no in list so it returning false b/c it not successful 