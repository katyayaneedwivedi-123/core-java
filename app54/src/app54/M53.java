package app54;

public class M53 {
	int test1() {
		return 10;
	}
	
	int test2(boolean b1) {
		return 10;
	}
	
//	int test3(boolean b1) {
//		if(b1) {
//			return 10;//it not compile b/c if(b1) is false then there is no return value 
//		}
//	}
//	int test4(boolean b1) {
//		if(b1) {
//			//if b1 is true then it not get the return value
//		}
//		else {
//			return 10;
//		}
//	}
	int test5(boolean b1) {
		if(b1) {
			return 5;
		}
		else {
			return 10;
		}
	}//it compile successful b/c it get return value both the conditions
	int test6(boolean b1) {
		if(b1) {
			
		}
		else {
			return 10;
		}
		return 20;
	}//it also true b/c it get the return statement in both condition
	
	int test7(boolean b1) {
		if(b1) {
			return 5;
		}
		else {
			
		}
		return 20;
	}//in this if boolean condition is true then return is 5 and if false then return is 20
}
//int test8(boolean b1) {
//	if(b1) {
//		return 5;
//	}
//	else {
//		return 10;
//	}
//	return 20;
//	}
//}//return 20 is not executed 
//this method is syntatically correct it run successful