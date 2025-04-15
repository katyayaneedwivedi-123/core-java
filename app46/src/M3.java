class M3 
{
	public static void main(String[] args) 
	{
		Object o1 = new A();//Object o1 = (Object) new A();
		A a1 = new C();
		A a2 = new D();
		B b1 = new C();
		B b2 = new D();
		o1 = a1;
		o1 = b1;
		a2 = b1;//a2 = (A) b1;
		System.out.println("done");
	}
}
//this type is upcasting 
/*
done
*/
//if right hand side subclass to the left hand side then compiler automatically
//upcasting to the required super class type