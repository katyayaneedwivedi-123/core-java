package pack1;

public class M15 {
	public static void main(String[] args) {
		System.out.println(1);
//		test1();
		System.out.println(2);
	}
	public static void test1() throws ClassNotFoundException {
		System.out.println(3);
		Class.forName("");
		System.out.println(4);
	}
}
//handling the exception we want to delicate its caller
//i don't want to handle the test1 
//throws is introduced only for the checked exceptions
//test1 give error b/c it want a try and catch but it don't provided so it give error
//it not compile successful b/c of the calling method
//we can develop any number of statements without the throws b/c calling statements taking the throws