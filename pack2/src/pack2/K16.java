package pack2;
import java.util.ArrayList;
import java.util.HashSet;
public class K16 {
	public static void main(String[] args) {
	ArrayList<Integer> list = new ArrayList<Integer>();

	list.add(90);

	list.add(12);

	list.add(89);

	list.add(56);

	list.add(90);

	list.add(12);

	list.add(89);

	list.add(56);

	System.out.println(list);

	HashSet<Integer> set = new HashSet<Integer>();

	set.addAll(list);

	System.out.println(set);
	}
}
