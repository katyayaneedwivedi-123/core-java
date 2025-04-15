class A
{
	int i;
}
class B extends A
{
	int j;
	public static void main(String[] args) 
	{
		B b1 = new B();
		System.out.println(b1.i);
		System.out.println(b1.j);
	}
}
//A is superclass and B is subclass
//means B(subclass) is extend the properties of A(superclass)
//i also a member of B
//so i is inherited but j is incorporated