class D 
{
	int i;
	D()
	{
		this.i = 400;
	}
	public static void main(String[] args) 
	{
		D d1 = new D();
		D d2 = new D();
		D d3 = new D();
		D d4 = new D();
		System.out.println(d1.i);
		System.out.println(d2.i);
		System.out.println(d3.i);
		System.out.println(d4.i);
	}
}
