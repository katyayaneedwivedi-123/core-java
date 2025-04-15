package pack1;

public class M11 {
//	void test() {
//		clone();
//	}

//clone is abnormal condition statement it not supported exception 
//we are not directly call the clone
//it is one of the checked exception condition also


//	void test2() {
//		try {
//			
//		}
//		catch(CloneNotSupportedException ex) {
//			
//		}
//	}//it also a compilation error b/c clone not supported a exception
	void test3() {
		try {
			clone();
		}
		catch(CloneNotSupportedException ex) {
			
		}
	}//it compilation successfully
//	void test4() {
//		try {
//			System.out.println("done");
//		}
//		catch(CloneNotSupportedException ex) {
//			
//		}
//	}//it also a compilation error b/c sop is not required to the clone
	//clone not supported exception
}