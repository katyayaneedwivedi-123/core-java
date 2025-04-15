package app73;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class E{
	int i, j, k;
	E(int i, int j, int k){
		this.i = i;
		this.j = j;
		this.k = k;
	}
	@Override
	public String toString() {
		return "(" + i + ", " + j + ", " + k +")";
	}
}
class SortA implements Comparator<E>{
	@Override
	public int compare(E o1, E o2) {
		return o1.i - o2.i;
	}
}
class SortB implements Comparator<E>{
	@Override
	public int compare(E o1, E o2) {
		return o1.j - o2.j;
	}
}
class SortC implements Comparator<E>{
	@Override
	public int compare(E o1, E o2) {
		return o1.k - o2.k;
	}
}
public class M5 {
	public static void main(String[] args) {
		E e1 = new E(10, 20, 30);
		E e2 = new E(20, 10, 30);
		E e3 = new E(10, 30, 20);
		E e4 = new E(30, 20, 10);
		E e5 = new E(40, 30, 50);
		E e6 = new E(60, 50, 70);
		List<E> list = new ArrayList<E>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		list.add(e6);
		System.out.println(list);
//		Collections.sort(list, new SortA());
//		System.out.println(list);
//		Collections.sort(list, new SortB());
//		System.out.println(list);
//		Collections.sort(list, new SortC());
//		System.out.println(list);
		list.sort(new SortA());
		System.out.println(list);
		list.sort(new SortB());
		System.out.println(list);
		list.sort(new SortC());
		System.out.println(list);
	}
}
//inside array list direct sort method is available