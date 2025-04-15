package pack2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class K {
	int i, j, k;
	K(int i, int j, int k){
		this.i= i;
		this.j = j;
		this.k = k;
	}
	@Override
	public String toString() {
		return "(" + i + ", " + j + ", " + k + ")";
	}
}
public class K11 {
	public static void main(String[] args) {
		List<K> list = new ArrayList<K>();
		list.add(new K(12, 34, 45));
		list.add(new K(13, 45, 23));
		list.add(new K(34, 78, 56));
		list.add(new K(36, 90, 47));
		list.add(new K(22, 66, 95));
		System.out.println(list);
		list.sort(new Comparator<K>() {
			@Override
			public int compare(K o1, K o2) {
				return o1.i - o2.j;
			}
		});
		System.out.println(list);
		list.sort(new Comparator<K>() {
			@Override
			public int compare(K o1, K o2) {
				return o1.j - o2.j;
			}
		});
		System.out.println(list);
		list.sort(new Comparator<K>() {
			@Override
			public int compare(K o1, K o2) {
				return o1.k - o2.k;
			}
		});
		System.out.println(list);
	}
}
