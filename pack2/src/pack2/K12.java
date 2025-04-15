package pack2;

import java.util.ArrayList;
import java.util.List;

class L{
	int i, j, k;
	L(int i, int j, int k){
		this.i = i;
		this.j = j;
		this.k = k;
	}
	@Override
	public String toString() {
		return "(" + i + ", " + j + ", " + k + ")";
	}
}
public class K12 {
	public static void main(String[] args) {
		L l1 = new L(12, 23, 23);
		L l2 = new L(34, 45, 77);
		L l3 = new L(52, 73, 56);
		L l4 = new L(162, 223, 823);
		L l5 = new L(124, 236, 283);
		List<L> list = new ArrayList<L>();
		list.add(l1);
		list.add(l2);
		list.add(l3);
		list.add(l4);
		list.add(l5);
		System.out.println(list);
		list.sort((o1, o2) -> o1.i - o2.k);
		System.out.println(list);
		list.sort((o1, o2) -> o1.j -o2.j);
		System.out.println(list);
		list.sort((o1, o2) -> o1.k - o2.k);
		System.out.println(list);
	}
}
