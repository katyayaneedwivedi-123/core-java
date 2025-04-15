package pack5;

import java.util.ArrayList;

public class SynchronizedList extends ArrayList{
	private ArrayList list;
	SynchronizedList(ArrayList list) {
		this.list = list;
	}
	
	@Override
	public boolean add(Object e) {
		boolean flag = false;
		synchronized (list) {
			System.out.println(Thread.currentThread().getName() + " adding " + e);
			flag = list.add(e);//it calling object lock of array list and taking this
			Util.sleep(3000);
			System.out.println(Thread.currentThread().getName() + " added " + e);
		}//it take object lock of global attribute(original array list) so it entered
		return flag;
	}
	
	@Override
	public Object get(int index) {
		Object obj = null;
		synchronized (list) {
			obj = list.get(index);
		}
		return obj;
	}//it also internally calling the array list get method
	
	@Override
	public Object set(int index, Object element) {
		Object obj = null;
		synchronized (list) {
			System.out.println(Thread.currentThread().getName() + " started set " + element);
			obj = list.set(index, element);
			Util.sleep(3000);
			System.out.println(Thread.currentThread().getName() + " finished setting " + element);	
		}
		return obj;
	}//it also internally calling the array list set method
	
	@Override
	public boolean contains(Object o) {
		boolean flag = false;
		synchronized (list) {
			flag = list.contains(o);
		}
		return flag;
	}//it also internally calling the array list contains method
	
	@Override
	public void clear() {
		list.add(9000);
		synchronized (list) {
			list.clear();
		};//before calling the clear method it required the object lock of array list
	}
}
//set method internally method of ArrayList and get and more also
//in the body of method we can call the same method inside the synchronized 
//we can not develop the own logic we can call only the method to override 
//all the method inside the synchronized block
//every override method using array list object lock for own method
//set and get method both have a sop