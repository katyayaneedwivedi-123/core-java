package app67;

import java.util.ArrayList;
import java.util.Iterator;

public class M27 {
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
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
//iterator read the element only one time 
//it can not read the more than one time