class C 
{
	private C()//private constructor can be used in same class
	{
		System.out.println("C()");
	}
	public static void main(String[] args) 
	{
		C c1 = new C();
		System.out.println("done");
	}
}
