package app73;

import java.util.Collections;
import java.util.List;
import java.util.Vector;

class H {
	int i, j, k;
	H(int i, int j, int k){
		this.i= i;
		this.j= j;
		this.k= k;
	}
	@Override
	public String toString() {
		return "(" + i + ", " + j + ", " + k + ")";
	}
}
public class M8 {
	public static void main(String[] args) {
		List<H> list = new Vector<H>();
		list.add(new H(10, 20, 30));
		list.add(new H(20, 10, 30));
		list.add(new H(10, 30, 20));
		list.add(new H(30, 20, 10));
		list.add(new H(30, 40, 50));
		System.out.println(list);
		list.sort((o1, o2) -> o1.i -o2.i);
		System.out.println(list);
		list.sort((o1, o2) -> o1.j -o2.j);
		System.out.println(list);
		list.sort((o1, o2) -> o1.k -o2.k);
		System.out.println(list);
	}
}
