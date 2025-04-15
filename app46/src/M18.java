class M18 
{
	public static void main(String[] args) 
	{
		C c1 = new D();
		D d1 = (D) c1;//c1 reference is not refering to D
		System.out.println("----------------");
		C c2 = new C();
		D d2 = (D) c2;
		System.out.println("----------------");
	}
}
//c1 is downcasting into D type
//compilation error