
//byte < short < int < long < float < double


class A 
{
	public static void main(String[] args) 
	{
		int i = 10;
		double j = 23.61;
		System.out.println(i);
		System.out.println(j);
		System.out.println("----------------");
		j = i; // auto widening 
			  //  j = (double) i;
		System.out.println(i);
		System.out.println(j);
		System.out.println("----------------");
		j = (double) i;
		System.out.println(i);
		System.out.println(j);
		System.out.println("----------------");
	}
}
//int is converting in double
//right hand side narrow means int 
//left hand side wider means double
//if rigt hand side is narrow then we don't require to do compiler 
//is automatically doing that is why it called a autowidening

/*
10
23.61
----------------
10
10.0
----------------
10
10.0
----------------
*/