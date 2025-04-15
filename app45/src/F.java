class F 
{
	public static void main(String[] args) 
	{
		int i = 20;
		double j = 10.4;
		i = j;//wider can't be assign narrow directly
		//means i is narrow then j
		//j = i;//then it run successfully
		System.out.println(i);
		System.out.println(j);
	}
}
//compilation error
//b/c int is narrow to double