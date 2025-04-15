class S
{
	public static void main(String[] args) 
	{
		int i = 7;
		switch (i)
		{
		case 1:
			System.out.println("from case 1");
			break;
		default:
			System.out.println("from default");
			break;
		case 2:
			{
				System.out.println("from case 2");
				break;
			}
		case 3:
			System.out.println("from case 3");
			break;
		default:
			System.out.println("from default");
			System.out.println("from default");
			System.out.println("from default");
			System.out.println("from default");
			break;
		}
		System.out.println("end");
	}
}
//more than default is not allow in switch body if both or the different default but it not allow more than 1 default
// compilation error