class E
{
	static int i;
}

class F extends E
{
	static int j;
	public static void main(String[] args) 
	{
		System.out.println(i);
		System.out.println(j);
		System.out.println(F.i);
		System.out.println(F.j);
		//System.out.println(E.i);//if we used this directly then it run successfully
	}
}
//i is also a member of class F b/c it inherited but j is incorporated
/*
0
0
0
0
*/