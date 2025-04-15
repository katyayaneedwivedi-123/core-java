package app67;

import java.util.ArrayList;
import java.util.Iterator;

public class M26 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(90);
		list.add(190);
		list.add(910);
		list.add(901);
		list.add(920);
		list.add(390);
		list.add(904);
		Iterator it = list.iterator();
		Object obj;
		while(it.hasNext()) {
			obj = it.next();
			System.out.println(obj);
			if(obj.equals(910)) {
				it.remove();
			}
		}
		System.out.println(list);
	}
}
//iterator is not a  container it is just a pointer it point the array list
//by calling hashNext method we can check element in array list or not
//while calling next method we iterate the element from the array list
//while calling the remove method it remove the element in array list