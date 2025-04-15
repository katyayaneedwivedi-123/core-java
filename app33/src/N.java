class N 
{
	static int i;
	public static void main(String[] args) 
	{
		N n1 = new N();
		N n2 = new N();
		N n3 = new N();
		System.out.println(i);
		System.out.println(N.i);
		System.out.println(n1.i);//replacing to N.i so it 0
		System.out.println(n2.i);//replacing to N.i so it 0
		System.out.println(n3.i);//replacing to N.i so it 0
		System.out.println("-----------------");
		n1.i = 450;//N.i = 450; replacing to classfile so all print 450
		System.out.println(i);
		System.out.println(N.i);
		System.out.println(n1.i);
		System.out.println(n2.i);
		System.out.println(n3.i);
	}
}
/*
0
0
0
0
0
---------------
450
450
450
450
*/
//static member are comman to every object