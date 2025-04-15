package app76;

public class M7 {
	public static void main(String[] args) {
		String s1 = "abc";
		System.out.println(s1);//abc
		s1.concat("xyz");//it create new object abcxyz but not effect in the s1
		System.out.println(s1);//abc
	}
}
//in string concate means join two String
//s1 and s2 both are receiving resulted string 
//so concate method returning resulting
//which ever new object is create they are abondend
//concate method whatever returning then no any other receiving 
//so s1 pointing to old object so s1 is give abc