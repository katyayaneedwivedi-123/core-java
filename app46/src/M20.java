class M20
{
	public static void main(String[] args) 
	{
		A a1 = new C();
		B b1 = (B) a1;
		System.out.println("-------11--------");
		C c1 = (C) a1;
		System.out.println("--------22-------");
		D d1 = (D) a1;//C object doesn't have D member
		System.out.println("---------33------");
	}
}
//it compile successfully but not run it give run time execption