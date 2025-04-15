class J
{
static int i = test1();
static int j = test2();
static int k = test1() + test2() + test3();
static int test1()
{
	System.out.println("test1:" + i + " , " + j + " ," + k);
	return i + j + k + 1;
}
static int test2()
{
	System.out.println("test2:" + i + " , " + j + " ," + k);
	i += 1;
	j += i + 2;
	k += i + j + 3;
	return i + j + k + 4;
}
static int test3()
{
	System.out.println("test3:" + i + " , " + j + " ," + k);
	i += i + j + k + 5;
	j += i + j + 6;
	k += i + 7;
	main(null);
	System.out.println("test32:" + i + " , " + j + " ," + k);
	return i + j + k + 8;
}
	public static void main(String[] args) 
	{
		System.out.println("main:" + i + " , " + j + " ," + k);
		i += i + j + k + 9;
		j += i + j + k + 10;
		k += i + j + k + 11;
	}
}
/*
test1:0 , 0 ,0
test2:1 , 0 ,0
test1:2 , 19 ,9//i(test2)j(return)k(test3)
test2:2 , 19 ,9
test3:3 , 24 ,39//i(test2)j(test2)k(main i add)
main:74 , 128 ,120//i(test3)j(test3)k(test3)
test32:405 , 791 ,1447//i(main i)j(main j)k(main k)
main:405 , 791 ,2752//k(sum of(return of test1 and return of test2 and return of test 3))
*/
