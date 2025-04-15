class M22 
{
	public static void main(String[] args) 
	{
		A a1 = new C();
		System.out.println(a1 instanceof Object);//a1 check object is availabe are not
		System.out.println(a1 instanceof A);//"" ""
		System.out.println(a1 instanceof B);//"" ""
		System.out.println(a1 instanceof C);//"" ""
		System.out.println(a1 instanceof D);//a1 chcek D but D is not here
	}
}
//instanceof checking object who is reference
//D ic not in instanceof a1 means it not available so it give run time exception