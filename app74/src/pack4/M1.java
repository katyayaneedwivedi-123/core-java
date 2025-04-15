package pack4;

import java.util.HashMap;
import java.util.Map;

class ThreadLocal<X> extends Thread{
	X value;
	private Map<Long, X> map = new HashMap<Long, X>();
	void set(X value) {
		map.put(Thread.currentThread().getId(), value);
	}//it store the value use of the id
	X get() {
		long id = Thread.currentThread().getId();
		return map.get(id);
	}//it return the value using id 
}
class Util{
	static void sleep(long millis) {
		try {
			Thread.sleep(millis);
		}
		catch(InterruptedException ex) {
			ex.printStackTrace();
		}
	}
}
class M1 {
	public static void main(String[] args) {
		ThreadLocal<Integer> obj = new ThreadLocal<>();
		new Thread(() ->{
			System.out.println("a:" + obj.get());
			obj.set(10);
			Util.sleep(1000);
			System.out.println("b:" + obj.get());
			obj.set(20);
			Util.sleep(1000);
			System.out.println("c:" + obj.get());
			obj.set(30);
			Util.sleep(1000);
			System.out.println("d:" + obj.get());
		}).start();
		new Thread(() ->{
			System.out.println("e:" + obj.get());
			obj.set(40);
			Util.sleep(1000);
			System.out.println("f:" + obj.get());
			obj.set(50);
			Util.sleep(1000);
			System.out.println("g:" + obj.get());
			obj.set(60);
			Util.sleep(1000);
			System.out.println("h:" + obj.get());
		}).start();
		obj.set(70);
		Util.sleep(10000);
		System.out.println("i:" + obj.get());
	}
}
//both are the different the id
//set the value through the set id 
//return the value use of the get id