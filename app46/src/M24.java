class M24 
{
	public static void main(String[] args) 
	{
		A a1 = new C();
		System.out.println(a1 instanceof A);
		System.out.println(a1 instanceof B);
		System.out.println(a1 instanceof C);
		System.out.println(a1 instanceof D);
		System.out.println(a1 instanceof String);
	}
}
//String is not related to a1
//Sring is either superclass or subclass or to subclass
//it give compilation error