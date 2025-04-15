package app67;

import java.util.ArrayList;
import java.util.Iterator;

public class M28 {
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
		list.add(100);
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
//ConcurrentModificationException
//after getting iterator if we adding element in array list then the read of list we get the exception this
//this type of iterator called a fail fast iterator