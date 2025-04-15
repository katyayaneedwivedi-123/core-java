import java.util.Scanner;
class C
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("pls enter your age");
		int age = sc.nextInt();
		System.out.println("pls enter your weight");
		double weight = sc.nextDouble();
		System.out.println("your input :" + age + ", " + weight);
	}
}
