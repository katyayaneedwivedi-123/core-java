package app64;

public class M13 {
	static Runnable getRunnable() {
		return new Runnable() {
			@Override
			public void run() {
				for(int i = 1; i <= 1000; i++) {
					System.out.println(i);
				}
			}
		};
	}
	public static void main(String[] args) {
		new Thread(getRunnable()).start();
		for(int i = 4000; i<= 5000; i++) {
			System.out.println(i);
		}
	}
}
//it is returning anonymous class type with the get Runnable


//class Thread implements Runnable 
//{
//	Runnable r1;
//	Thread( )
//	{
//	
//	}
//	Thread(Runnable r1)
//	{
//		this.r1 = r1;
//	}
//	public void run()
//	{
//		if(r1 != null)
//		{
//			r1.run();
//		}
//		
//	
//	public void start()
//	{
//		//registering with a thread Scheduler
//		run();
//	}
//	//other member	
//}
