package app63;
class A extends Thread{
	@Override//it is optional while overriding a method
	public void run() {
		for(int i = 3000; i< 4000; i++) {
			System.out.println(i);
		}
	}
}
public class M3 {
	public static void main(String[] args) {
		A a1 = new A();//new thread is created but it have no threadness here
		a1.start();//registering newly created thread with thread schedular
		
		for(int i = 8000; i< 9000; i++) {
			System.out.println(i);
		}
	}
}
//execution is happening in parallelly in random output is coming 
//we do the parallelly execution through the use of overriding thread class
//new thread is creating the new thread is child and main method is parent