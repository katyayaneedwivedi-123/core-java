import java.io.*;

class H
{
	public static void main(String[] args) throws Exception
	{
		if(args.length == 0)
		{
			System.out.println("supply file name to read");
			return;
		}
		FileReader f1 = new FileReader(args[0]);
		BufferedReader b1 = new BufferedReader(f1);
		String s1 = b1.readLine();
		while(s1 != null)
		{
			System.out.println(s1);
			s1 = b1.readLine();
		}
		System.out.println("end of the program");
	}
}