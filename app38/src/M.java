class M 
{
	M(int i)
	{
	}
	public static void main(String[] args) 
	{
		M m1 = new M();//M() is empty so it compilation error
		System.out.println("Hello World!");
	}
}
//compilation error
//if we give the vlaue like M(10) so it compile successfully