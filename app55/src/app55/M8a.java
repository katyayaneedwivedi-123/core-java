package app55;

class D1 { 
 	static int i ;  	
 	void test(){ 
 	 	System.out.println("from A class test"); 
 	} 
 	static void test2() 
 	{ 
 	 	System.out.println("from static test2"); 
 	} 
 	static 
 	{ 
 	 	test2(); 
 	} 
 	} 
class B1 extends D1 { 
	void test() { 
 	 	
		System.out.println("from B class test");
 	 	
 	 	super.test(); 
 	} 
 	void test1() 
 	{ 
 	 	D1.test2();  	 
 	 	D1.i = 79;  	 
 	 	test(); 
 	 	super.test(); 
 	} 
} 
public class M8a { 
public static void main(String[] args) { 
	D1	a1 = new D1(); 
	B1	b1 = new B1(); 
 	 
 	a1.test(); 
 	 
 	b1.test();
 	
 	b1.test1();
 	
 	D1.test2();
 	
 	b1.test2(); 
} 


}