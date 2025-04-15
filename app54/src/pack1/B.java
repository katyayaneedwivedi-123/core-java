package pack1;

import java.io.IOException;

class A{
	void test1() throws ClassNotFoundException{
		//some implementation
	}
	void test2() throws InterruptedException{
		//some implementation
	}
	void test3() throws IOException {
		//some implementation
	}
	void test4() throws ArithmeticException{
		//some implementation
	}
	void test5() {
		//some implementation
	}
}
public class B extends A{
//	void test1() throws ClassNotFoundException{
//		
//	}
//	void test1(){
//		
//	}
//	void test2() throws InterruptedException{
//		
//	}
//	void test2() {
//		
//	}
//	void test3() throws IOException{
//		
//	}
//	void test3() {
//		
//	}
//	void test4() throws ArithmeticException{
//		
//	}
//	void test4(){
//	
//	}
//	void test5() throws ArrayIndexOutOfBoundsException{
//		
//	}
//	void test5() {
//		
//	}
}
//any method can be override in the subclass without the throws 
//any method can be override in the subclass by using throws unchecked
//throws is not a mandatory in the overriding
//by overriding the test1 method in the subclass then you want to check class not found
//by overriding the test2 method in the subclass then you want to check the throws
//by overriding the test4 method in subclass it skip the throws
