class G
{
	public static void main(String[] args) 
	{
		int i = 1;
		while(i <= 5)
		{
			System.out.println("loop body:" + i);
			if(i == 3)
			{
				System.out.println("if block" + i);
				i++;
				continue;
			}
				System.out.println("loop body:" + i);
				i++;
		}
			System.out.println("main end:" + i);
	}
}
/* before conttinue should be changes then it not goto infinite otherwise it goto infinite execution
loop body:1
loop body:1
loop body:2
loop body:2
loop body:3
if block3
loop body:4
loop body:4
loop body:5
loop body:5
main end:6
*/