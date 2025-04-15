package app60;

class E {
	static E obj;
	@Override
	protected void finalize() throws Throwable {
		obj = this;
	}
}
public class M5 {
	public static void main(String[] args) throws Exception{
		E e1 = new E();
		System.out.println("a:" + e1);//in this the address
		System.out.println("b:" + E.obj);//this is null given
		e1 = null;//object became abandoned
		System.gc();//then it request
		Thread.sleep(1000);//line number16 and 17 is called a reselected 
		System.out.println("c:" + e1);//this is null
		System.out.println("d:" + E.obj);//this is address
		E.obj = null;//it became abandoned
		System.gc();//it not call finalized method b/c it have already reselected
		Thread.sleep(1000);
		System.out.println("e:" + e1);//it give null
		System.out.println("f:" + E.obj);//it also give the null
	}
}
//reselected method is becoming abandoned then direct garbage collector is removing automatically without calling the finalized method