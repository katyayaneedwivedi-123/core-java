package pack2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Spliterator;

public class M9 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(90);
		list.add(80);
		list.add(70);
		list.add(60);
		list.add(50);
		list.add(40);
		list.add(30);
		list.add(20);
		list.add(10);
		Spliterator<Integer> it = list.spliterator();
		it.forEachRemaining(t1 -> System.out.println(t1));
	}
}
//Spliterator is introduced in jdk 1.8
//by using this Spliterator we can do the parallel processing