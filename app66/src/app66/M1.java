package app66;
class Shared {
//	void test1() {
	synchronized void test1() {
		String name = Thread.currentThread().getName();
		for(int i = 1; i <= 1000; i++) {
			System.out.println(name + "-test1-" + this + ":" + i);
		}
	}
}

class A extends Thread{
	Shared s1;
	A(Shared s1){
		this.s1 = s1;
	}
	public void run() {
		s1.test1();//A thread is calling test method is use of s1 so s1 is synchronized 
		//so s1 is required a object lock if it have then it enter in test1
	}
}

class B extends Thread{
	Shared s1;
	B(Shared s1){
		this.s1 = s1;
	}
	public void run() {
		s1.test1();//B thread also required s1 object lock to enter test1 b/c they also used s1
		//it not take the B class object class lock
	}
}
public class M1 {
	public static void main(String[] args) {
		Shared s1 = new Shared();//it have only one object lock
		Shared s2 = new Shared();//it is nothing but the main thread in s1
		//if we give the s2 in B then it executed simultaneously
		//s1.test1 = s2 and s2.test1 = s1
		
		A a1 = new A(s1);//it have only one lock but then in class A calling test1 only s1 object lock required not a A class
		a1.start();
		
		B b1 = new B(s2);//it have only one lock
		b1.start();
		
		System.out.println("done");
	}
}
//if 
//we can shared an object to thread an constructor
//same object share to different thread
//both are executing simultaneous without the use of the synchronization
//if we use the synchronization then it give the output sequentially
//it give the output in the form of-
//thread name then -test1- then memory location : i value
//shared object have a only one object lock and A object have only one object lock and B object have also only one object lock
//unfortunately test1 method is synchronized but both A and B is calling test1 method
//so it required s1 object lock to enter into synchronized 
//when A is executed then B is waited the A is completed the execution then thread is go in B 