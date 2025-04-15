package pack4;

import java.util.HashMap;

class ThreadLocal1<Y> extends Thread{
	Y value;
	private HashMap<Long, Y> map = new HashMap<Long,Y>();
	void set(Y value) {
		map.put(Thread.currentThread().getId(), value);
	}
	Y get() {
		long id = Thread.currentThread().getId();
		return map.get(id);
	}
}
class Util1{
	public void sleep(long millis) {
		try {
			Thread.sleep(millis);
		}
		catch(InterruptedException ex) {
			ex.printStackTrace();
		}
	}
}
public class M1a {
	public static void main(String[] args) {
		ThreadLocal1<Integer> local = new ThreadLocal1();
		new Thread(() ->{
			System.out.println("a :" + local.get());
			local.set(90);
			Util.sleep(1000);
			System.out.println("b :" + local.get());
			local.set(234);
			Util.sleep(1000);
			System.out.println("c :" + local.get());
			local.set(980);
			Util.sleep(1000);
			System.out.println("d :" + local.get());
		}).start();
		
		new Thread(() ->{
			System.out.println("e :" + local.get());
			local.set(355);
			Util.sleep(1000);
			System.out.println("f :" + local.get());
			local.set(578);
			Util.sleep(1000);
			System.out.println("g :" + local.get());
			local.set(2309);
			Util.sleep(1000);
			System.out.println("h :" + local.get());
		}).start();
		local.set(1000);
		Util.sleep(1000);
		System.out.println("i :" + local.get());
	}
}
