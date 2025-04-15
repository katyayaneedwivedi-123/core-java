package app54;

public class M55 {
	int test1()
	{
		try {
			return 1;
		}
		catch(ArithmeticException e) {
			return 2;
		}
		finally {
			return 4;
		}
	}
	boolean test2() 
	{
		try {
			return true;
		}
		catch(ArithmeticException e1) {
			return false;
		}
		finally {
			
		}
	}
	String test3() 
	{
		try {
		}
		catch(ArithmeticException e1) {
			return "sdwe";
		}
		finally {
			return "abc";
		}
	}
	double test4() 
	{
		try {
		}
		catch(ArithmeticException e1) {
			return 5.34;
		}
		finally {
			
		}
		return 8.2;
	}
}
