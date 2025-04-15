package app58;
interface K1 < DJW>{
	DJW test();
	void test1(DJW t1);
}
class I1 implements K1<String> {
	public String test() {
		System.out.println("For Revision Practice");
		return "abc";
	}
	@Override
	public void test1(String t1) {
		System.out.println("Munna bhaiya chutiya hai" + t1);
	}
}
class J1 implements K1<Integer>{
	@Override
	public Integer test() {
		System.out.println("Integer is here");
		return 45;
	}
	public void test1(Integer t1) {
		System.out.println("Integer" + t1);
	}
}
public class M9a {
	public static void main(String[] args) {
		I1 i = new I1();
		System.out.println(i.test());
		i.test1(" mai kuchh nhi kah sakti");
		System.out.println("---------");
		
		J1 j = new J1();
		System.out.println(j.test());
		j.test1(87898);
		System.out.println("----------------");
	}
}
