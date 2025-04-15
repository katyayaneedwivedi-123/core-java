package app54;

public class M54 {
	int test1() {
		try {
		//several statements here	
		}
		catch(ArithmeticException ex) {
			
		}
		return 10;
		//try executed successfully b/c it have return 10 and catch have exception it getting handle then flow is become normal then it have return value
		//there is exception which is other than Arithmetic then it not handle then the flow is terminating then what is the need of value
	}
//	int test2() {
//		try {
//			//several statements here
//			return 10;
//		}
//		catch(ArithmeticException ex) {
//			
//		}
//	}//it have no return statement in catch then it is a compile time error
//int test3() {
//	try {
//		//several statements here
//	}
//	catch(ArithmeticException ex) {
//		return 10;
//	}
//}//assume try executed very successfully then catch won't execute then try have no return statement
int test4() {
	try {
		//several statements here
	}
	catch(ArithmeticException ex) {
		return 10;
	}
	return 5;
}//both are return the value so it successful
int test5() {
	try {
		//several statements here
		return 4;
	}
	catch(ArithmeticException ex) {
	}
	return 5;
}//both are return the value so it successful
//int test6() {
//	try {
//		//several statements here
//		return 4;
//	}
//	catch(ArithmeticException ex) {
//		return 1;
//	}
//	return 5;
//}//it not successful b/c return 5 is not executed any flow(try and catch)
//return 5 is never execute it is a unreachable statement
}

