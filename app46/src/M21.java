class M21 
{
	public static void main(String[] args) 
	{
		Test.f1(new D());
		System.out.println("-------11------");
		Test.f1(new C());
		System.out.println("-------22------");
		Test.f1(new B());
		System.out.println("-------33------");
		Test.f1(new A());//A is not in test method so
		System.out.println("-------44------");
	}
}
//it give run time exception
//arg directed downcastint into B