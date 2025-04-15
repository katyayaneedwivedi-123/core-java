class G 
{
	public static void main(String[] args) 
	{
		if(false)
		{
			System.out.println(1);
		}
		else
		{
			int i = 30;
			System.out.println(21);
			System.out.println(22);
			System.out.println(i);
			i++;
			System.out.println(i);
		}
		System.out.println(3);
		System.out.println(i);	//	i is local to else body i cann't be used outside of else
	}
}
	//	compilation error