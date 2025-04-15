package app60;
class D {
	@Override
	protected void finalize() throws Throwable {
		System.out.println("i am from finalize");
	}
}
public class M4 {
	public static void main(String[] args) {
		D d1 = new D();//object created
		d1 = null;//same object became abandoned in here
		//finalized method is not called
		System.gc();
	//	Runtime.getRuntime().gc();
		System.out.println("done");
	}
}
//Runtime.getRuntime().gc(); and System.gc(); are a two statement we request a garbage collector
//garbage collector may be listening or not but it is not command it is a request
//finalized method is unsupplied no guarantee