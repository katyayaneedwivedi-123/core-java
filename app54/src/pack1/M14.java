package pack1;

public class M14 {
	public static void main(String[] args) {
		System.out.println(1);
		test1();
		System.out.println(2);
	}
	public static void test1() {
		System.out.println(3);
		try {
			Class.forName("");//under "" what ever class name you provided the class is loaded to the memory forcefully
			//any class loading to the memory explicitly 
		}
		catch(ClassNotFoundException ex) {
			ex.printStackTrace();
		}
		System.out.println(4);
	}
}
//Class.forName is having a try catch
//it compile successfully
//we not give the class name under the "" so it give the exception
//we provide the try catch in this so it run and compile successfully
//it getting handled at the raised of handling it self
//it is checked