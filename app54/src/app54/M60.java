package app54;

public class M60 {
	int test1() {
	try {
		//several statements
	} 
	catch (ArithmeticException ex) {
		
	}
	finally {
		
	}
	return 10;
}
//	int test2() {
//		try {
//			//several statements
//			return 10;
//		} 
//		catch (ArithmeticException ex) {
//			
//		}
//		finally {
//			
//		}
//	}//this is compilation error b/c return is not available for all statements
	int test3() {
		try {
			//several statements
			return 10;
		} 
		catch (ArithmeticException ex) {
			
		}
		finally {
			
		}
		return 20;
	}//it successful b/c return is available for all the statements
	int test4() {
		try {
			//several statements
			return 10;
		} 
		catch (ArithmeticException ex) {
			return 20;
		}
		finally {
			
		}
	}//it successful b/c return is available the statements if try executed then return available if catch executed then return also available
	int test5() {
		try {
			//several statements
			return 10;
		} 
		catch (ArithmeticException ex) {
		}
		finally {
			return 20;
		}
	}//it successful b/c of the finally
	int test6() {
		try {
			//several statements
		} 
		catch (ArithmeticException ex) {
		}
		finally {
			return 20;
		}
	}//it successful b/c if try block executed then return is available in finally if catch then return available b/c of finally
//	int test7() {
//		try {
//			//several statements
//		} 
//		catch (ArithmeticException ex) {
//		}
//		finally {
//			return 20;
//		}
//		return 110;
//	}//it is a compilation error b/c finally block have already return statement so after finally we can not keep any statement
	//b/c all statements goes to the finally so after finally return statement is not executed
}
