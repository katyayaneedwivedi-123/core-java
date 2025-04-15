package app64;

public class M15 {
	public static void main(String[] args) {
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println(1);
			}
		})
		{
		}.start();
	}
}
//skeleton method check the thread class is null or not 
//it not a null so it go for override method and 
//and here the override method is runnable so 
//it give the output in runnable
//the output is 1