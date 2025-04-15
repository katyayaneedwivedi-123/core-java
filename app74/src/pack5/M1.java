package pack5;

import java.util.ArrayList;
import java.util.List;

class Util {
	static void sleep(long millis) {
		try {
			Thread.sleep(millis);
		} 
		catch (InterruptedException ex) {
			ex.printStackTrace();
		}
	}
}

class A extends Thread {
	ArrayList<Integer> list;
	A(ArrayList<Integer> list){
		this.list = list;
	}
	@Override
	public void run() {
		list.add(1000);
	}
}
class B extends Thread {
	ArrayList<Integer> list;
	B(ArrayList<Integer> list){
		this.list = list;
	}
	@Override
	public void run() {
		list.add(9000);
	}
}
class C extends Thread {
	ArrayList<Integer> list;
	C(ArrayList<Integer> list){
		this.list = list;
	}
	@Override
	public void run() {
		list.set(2, 4000);
	}
}
public class M1 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		//list is non synchronized
		list.add(9000);
		list.add(91000);
		list.add(19000);
		list.add(19000);
		list.add(90001);
		list.add(19000);
		list.add(19000);
		
		list = new SynchronizedList(list);//arrayList send the reference of the constructor
		//now list is synchronized
		new A(list).start();
		new B(list).start();
		new C(list).start();
		//all three required the object lock of array list then it go in synchronized list
		
		
		
		
	}
}
//we resupplied the constructor of Util
//which ever getting the object lock this execute the first
//every method used the object lock of array list
//every method like A and B going to the add method
//and C is going in the set method
//every thread is using the synchronized array list(originally) object lock
//we can not call the method directly