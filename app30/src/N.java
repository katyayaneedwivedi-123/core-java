class N 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		M.f1();
		System.out.println("main begin");
	}
}
//M classe is not saved as M.java it saved Test.java but we are using in Nfile as M.java so compiler not find the M classes
//so it is compilation error