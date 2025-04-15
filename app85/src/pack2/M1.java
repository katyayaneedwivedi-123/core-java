package pack2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class M1 {
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
		Iterator<Integer> it = list.iterator();
		Consumer<Integer> c1 = new Consumer<Integer>() {
			
			@Override
			public void accept(Integer t) {
				System.out.println(t);
				
			}
		};
		it.forEachRemaining(c1);
		System.out.println("--------");
		it.forEachRemaining(element -> System.out.println(element));
		System.out.println("------------");
		it.forEachRemaining(System.out :: println);
	}
}
//for each require a argument the is consumer 
//consumer is a functional interface that take one argument 
//System.out::println creates a reference to the println method of System.out. This method reference is then passed to forEachRemaining as a Consumer.
//in last 2 forEcahRemaining have a no remaining element so it not print anything