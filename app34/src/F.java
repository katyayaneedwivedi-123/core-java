class F 
{
	int i;
	F(int p)
	{
		i = p; //this.i = p
	}
	public static void main(String[] args) 
	{
		F f1 = new F(90);//90 assign to p p assign to i i is a member of object
		F f2 = new F(190);
		F f3 = new F(901);
		F f4 = new F(920);
		F f5 = new F(390);
		System.out.println(f1.i);
		System.out.println(f2.i);
		System.out.println(f3.i);
		System.out.println(f4.i);
		System.out.println(f5.i);
	}
}
