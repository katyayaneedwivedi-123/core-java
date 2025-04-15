package pack1;

public class M6 {
	public static void main(String[] args) {
		System.out.println(1);
		test1();//exception is ducking
		System.out.println(2);
	}
	static void test1() {
		System.out.println(3);
		int i = 10 / 0;//exception occurred
		System.out.println(4);
	}
}
//exception is in line number 11 
//so we take only 2 and 3 as output 
//it is unchecked so it executing 
//but it have no try catch so it not handled the exception so the remaining portion of the method is not executing
//test method is forcefully removing by the stack unwidening by the 
//line no6 doesn't have the try catch method is not executed
//so remaining portion of the main method is not executing
//caller of the main method is the java command
//java command printing thread name and also print stack trace
//inside a stack whatever the method those are tracing