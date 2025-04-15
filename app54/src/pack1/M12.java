package pack1;

public class M12 {
//	void test1() {
//		Thread.sleep(10);//it is a abnormal condition
//	}//it required a interrupted exception
	
//	void test2() {
//		try {
//			
//		}
//		catch(InterruptedException e) {
//			//it is abnormal condition it take the interrupted condition
	//no calling statement in the sleep body so it give exception
//		}
//	}
	void test3() {
		try {
			Thread.sleep(20);
		} 
		catch (InterruptedException e) {
			
		}
	}//it compile successfully
}
