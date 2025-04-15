class A 
{
	public static void main(String[] args) 
	{
		int i = 13;
		switch (i)
		{
		case 2:
			System.out.println("from case 2");
		case 5:
			System.out.println("from case 5");
		case 12:
			System.out.println("from case 12");
		case 13:
			System.out.println("from case 13");
		
		}
	}
}
/*	output is from case 13
switch args should be integer result
inside a switch body any no of cases can be develop
the case value should be a constant expression result and also it should be in the range of switch args
every case should take unique value not duplicate
two cases should not have same constant result
under one case we can develope any no of statement or any type of statement
while running switch args value will camparing the case in the order of top to bottom
whichever case value same as switch case value that particular case will be executed*/