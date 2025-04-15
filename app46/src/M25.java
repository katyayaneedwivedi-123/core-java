class M25 
{
	public static void main(String[] args) 
	{
		Test.f2(new D());
		System.out.println("--11--");
		Test.f2(new C());
		System.out.println("--22--");
		Test.f2(new B());
		System.out.println("--33--");
		Test.f2(new A());
		System.out.println("--44--");
		Test.f2(new Object());
		System.out.println("--55--");
	}
}
/*
f2 begin
conerted into B
f2 end
--11--
f2 begin
conerted into B
f2 end
--22--
f2 begin
conerted into B
f2 end
--33--
f2 begin
f2 end
--44--
f2 begin
f2 end
--55--
*/
//no matter what we supply in f2  
//f2 method got created to prevent execution 
//don't go downcast directly we take suggesstion in upcast