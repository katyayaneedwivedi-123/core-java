class C 
{
	static void test(float f1)//b/c we are write the float then convert
	//only the byte to float value not more than the float
	{
		System.out.println("test:" + f1);	
	}
	public static void main(String[] args) 
	{
		byte v1 = 100;
		short v2 = 100;
		int v3 = 100;
		long v4 = 100;
		float v5 = 100;
		double v6 = 100;//this is not allow so it give error
		
		test(v1);
		test(v2);
		test(v3);
		test(v4);
		test(v5);
		test(v6);//if we don't call v6 then it run successfully
		System.out.println("Hello World!");
	}
}
//we call a test method only v1 to v5
//v6 is not allow v6 is give compilation error
//compilation error
//we supply float and double . float is narrow than double but the right hand side is double so it give error