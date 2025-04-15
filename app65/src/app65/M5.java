package app65;
class B extends Thread {
@Override
public void run() {
	Thread t1 = Thread.currentThread();
	System.out.println(t1.getId());
	System.out.println(t1.getName());
	System.out.println(t1.getPriority());
	System.out.println(t1.isDaemon());
}
}
public class M5 {
public static void main(String[] args) {
	Thread t1 = Thread.currentThread();
	System.out.println(t1.getId());
	System.out.println(t1.getName());
	System.out.println(t1.getPriority());
	System.out.println(t1.isDaemon());
	System.out.println("-----------");
	t1.setPriority(Thread.MAX_PRIORITY);
	B b1 = new B();
//	b1.start();//if we use this start method then it run all the main and child thread also
	b1.run();//if we use the run method then main method only executed not the child thread
	//b/c it have no threadness feature
}
}
//by the time of creating a child whatever the priority the parent is holding 
//same priority is holding to the child
//main thread is executed then main is starting the child so 
//so we change the main thread priority after executing the main then so thread is extends the main thread priority 10