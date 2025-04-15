package app65;

public class M2 {
	public static void main(String[] args) {
		Thread t1 = Thread.currentThread();
		System.out.println(t1.getName());
		System.out.println(t1.getId());
		System.out.println(t1.getPriority());
		System.out.println(t1.isDaemon());
		System.out.println("----------");
		t1.setName("initiator");
		t1.setPriority(10);
		System.out.println(t1.getName());
		System.out.println(t1.getId());
		System.out.println(t1.getPriority());
		System.out.println(t1.isDaemon());
	}
}
//we can change the priority and the name use of the 
//setName and setPriority
//set the priority b/w the 1 to 10
//minimum is 1 priority and maximum is 10 priority 
//if we set priority less than 1 and greater than 10 then we will get a exception
//every thread have a unique id 
//2 thread can not be the same id
//thread id can not be change it have no secondary  method it give compile time error
//generally the programming language there are 2 type of thread 1. user thread 2. daemon thread
//user thread it not depending on the parent thread life means if the parent is leaving it survive 
//daemon thread is depending on the parent life whenever its parent it leaving child also leaving
//in java all the thread is daemon thread by default in beginning
//before start we can convert the thread into daemon
//we can not change the main thread into daemon b/c it always started