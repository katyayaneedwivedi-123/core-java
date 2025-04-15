package app64;

public class M11a {
	public static void main(String[] args) {
	Thread r = new Thread() {
		@Override
		public void run() {
			for(int i = 1; i <= 2000; i++) {
				System.out.println(i);
			}
		}
	};
		M11a m = new M11a();
		r.start();
		System.out.println("end");
	}
}
