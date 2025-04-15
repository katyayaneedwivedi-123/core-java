package app63;

class D extends Thread {
	@Override
	public void run() {
		for(int i = 3000; i <= 4000; i++) {
			System.out.println(i);
		}
	}
}
class M5 {
	public static void main(String[] args) {
		D d1 = new D();
		d1.start();
		
		D d2 = new D();
		d2.start();
		
		D d3 = new D();
		d3.start();
		
		for(int i = 13000; i <= 14000; i++) {
			System.out.println(i);
		}
	}
}
//for the same class we have multiple tread created
//for the same run method multiple thread is created
//if we create the multiple thread for the same class then it give the multiple same thread output in the run time
//means if we create the multiple thread for the same class then it executed the entire thread 