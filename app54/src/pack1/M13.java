package pack1;

public class M13 {
	//Class.forName("") ==> ClassNotFoundException
	//clone();			==> CloneNotSupportedException
	//sleep(), join(), wait() ==> InterruptedException
	//file handling statements ==> IoException/FileNotFoundException
	//parse method in DateFormat ==> ParseException
	//JDBC statements    ==> SOLException
	//java networking    ==> MalFormedURLException
	
	public static void main(String[] args) {
		System.out.println(1);
		test1();
		System.out.println(2);
	}
	public static void test1() {
		System.out.println(3);
		try {
		Class.forName("");
		}
		catch(ClassNotFoundException ex) {
			System.out.println("Exception");
		}
		System.out.println(4);
	}//it is checked exception we did not provide the try catch
	// and not provide the throws 
}
//line number 19 is a compilation error
