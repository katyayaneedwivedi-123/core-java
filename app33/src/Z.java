class Z 
{
	int i;
	static Z test(Z obj)
	{
		System.out.println("test:" + obj.i);
		//					test:    10
		Z ref = new Z();
		obj.i += 20;
		//		30
		ref.i = obj.i + 30;
		//	i = 60
		return ref;
	}
	public static void main(String[] args) 
	{
		Z z1 = new Z();
		z1.i = 10;
		System.out.println("main1:" + z1.i);
		//					main1:    10
		Z z2 = test(z1);
		System.out.println("main2:" + z1.i);
		//					main2:    30
		System.out.println("main3:" + z2.i);
		//					main3:	  60
	}
}
/*
main1:10
test:10
main2:30
main3:60
*/