class E 
{
	static float test1(short s1)
	{
		return test2(s1);//return (float) test2((int) s1);
	}
	static long test2(int s1)
	{
		return s1;//return (long) s1;
	}
	public static void main(String[] args) 
	{
		byte b1 = 100;
		double d1 = test1(b1);//double d1 = (double) test1((short)b1);
		System.out.println(d1);
	}
}
//first byte convert in short
//then short return in test2 it conert in int 
// then int s1 is convert into long then
//return in s1 and s1 is converted in float
/*
100.0
*/
//total 5 convertion are there