class S
{
	public static void main(String[] args) 
	{
		int i = 1;
		while(i <= 5);
		{
			System.out.println("loop body:" + i++);
			System.out.println("loop body:" + i++);
			System.out.println("loop body:" + i++);
			System.out.println("loop body:" + i++);
			System.out.println("loop body:" + i++);
		}
		System.out.println("main end:" + i);
	}
}
// it is not a blank it is a  infinite loop execution b/c of while(;) is ending in line no 6 
// it check the body no body is here so it goto boolean statement and it give infinite execution