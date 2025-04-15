class M19 
{
	public static void main(String[] args) 
	{
		A a1 = new C();
		B b1 = a1;//A can not be converted in to B
		System.out.println("-------11--------");
		C c1 = a1;//A can not be converted in to C
		System.out.println("--------22-------");
		D d1 = a1;//A can not be converted in to D
		System.out.println("---------33------");
	}
}
//compilation error