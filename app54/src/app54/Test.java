package app54;
	class T {
		static int a = 5;
		T()
		{
			this(a--);
			System.out.println("T");
		}
		T(int a)
		{
			this("hi");
			System.out.println("T(int)");
			System.out.println(a);
		}
		T(String b){
			System.out.println("T(String)");
		}
		static {
			a++;
			System.out.println("SIB-T");
		}
		{
			System.out.println("IIB-T");
			System.out.println(a);
		}
		int i = test();
		int test() {
			System.out.println("test-T");
			return 200;
		}
	}
	class Test extends T
	{
		 static int a = 20;
		 Test()
		 {
			 this(a++);
			 System.out.println("Test()");
			 System.out.println(a++);
		 }
		 Test(int i)
		 {
			 System.out.println("Test(int)");
			 System.out.println(a++);
		 }
		 static 
		 {
			 System.out.println("SIB-Test");
		     a++;
		 }
		{
			System.out.println("IIB-Test");
			a++;
			System.out.println(a);
		}
		int i = test();
		
		public static void main(String[] args) 
		{
			Test obj = new Test();
			System.out.println(a++);
			System.out.println(a);
			System.out.println(obj.i);
		}
		int test() {
			System.out.println("test()");
			return 10;
		}
	}
