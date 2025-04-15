package set1;

public class Q29 {
	public static void main(String[] args) {
		int[] elements = {57, 20, 30, 44, 50, 27, 70, 88, 77};
		
		int sum = 0;
//		int avg = 0;
		for (int i = 0; i < elements.length; i++) {
			sum += elements[i];
	//		avg = sum / elements.length;
		}
		double avg = (double) sum / elements.length;
		System.out.println(avg);
		System.out.println("done");
	}
}
//Find the average value of an int array