class M9 
{
	public static void main(String[] args) 
	{
		A a1 = new B();
		B b1 = a1;
		System.out.println("done");
	}
}
//compilation error
//right hand side is super class then definitly we do down casting
//otherwise it give compilation error