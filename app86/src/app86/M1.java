package app86;

public class M1 {
	enum Day{
		MON, TUE, WED, THR, FRI, SAT, SUN;
	}
	public static void main(String[] agrs) {
		System.out.println(Day.THR);
		System.out.println(Day.MON);
		System.out.println(Day.THR);
		System.out.println(Day.FRI);
		System.out.println(Day.SAT);
		System.out.println(Day.SUN);
		System.out.println(Day.WED);
	}
}
//for the we name we can only go in enum it avoid the confusion
//enum is a member of java file and a member of class 
//we can develop a enum inside or outside anywhere
//we can use only half week name not a full like Sunday it's a wrong