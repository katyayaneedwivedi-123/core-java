package pack1;
interface A {
	void test1();//it's a abstract test1 method
}
public class M1 {
	static void f1() {
		System.out.println("f1");
	}
	public static void main(String[] args) {
		A a1 = M1 :: f1;
		a1.test1();
	}
}
//f1 is a static   m1 it refer to the m1 it assigning the method of m1
//::  is called a method reference operator it is used for the functional interface 
//it have a one method there this is implement can be assign in any existing method