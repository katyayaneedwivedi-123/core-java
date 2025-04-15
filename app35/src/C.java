class C
{
	C(int i, int j)
	{
		System.out.println("C(int i, int j)");
	}
	C(double i, int j)
	{
		System.out.println("C(double i, int j)");
	}
	public static void main(String[] args) 
	{
		C c1 = new C(90, 20);
		System.out.println("----------------");
		C c2 = new C(4.90, 20);
		System.out.println("----------------");
		C c3 = new C(45, 201);
		System.out.println("----------------");
		C c4 = new C(13.90, 220);
		System.out.println("----------------");
	}
}