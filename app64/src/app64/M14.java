package app64;

public class M14 {
	public static void main(String[] args) {
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println(1);
			}
		})
		{
			@Override
			public void run() {
				System.out.println(2);
			}
		}.start();
	}
}
//the output is 2 
// the use of skeleton method this.r1 = r1 and r1 value is thread constructor it go to the if condition on the skeleton method is not null
//so it go for override method it have another override method is available so it override the available override method 
//and then it give the output is 2