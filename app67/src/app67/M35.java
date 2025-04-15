package app67;

import java.util.ArrayList;
import java.util.ListIterator;

public class M35 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(90);
		list.add(190);
		list.add(910);
		list.add(901);
		list.add(920);
		list.add(390);
		list.add(904);
		ListIterator it = list.listIterator();
		it.add(9999999);
		while(it.hasNext()) {
			System.out.println(it.next());
			}
		System.out.println("-------------");
		while(it.hasPrevious()) {
			System.out.println(it.previous());
		}
		System.out.println(list);
	}
}
//inside list iterator is a add method the element 
//hasPrevious method we use to adding the element in the left side the 
//begnining of the left side 
//