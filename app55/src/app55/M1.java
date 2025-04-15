package app55;

public class M1 {//outer class
	private class A{//inner class
		//several features
	}
	static class B{//inner class
		
	}
}
//M1 is a treated as a outer classes
//A and B are a inner classes
//outer class can not be static it can be only public and default
//B is a member of M1 it can be static but M1 can not be static 
//outer class can not be private and protected
//inner class can be any access level private public protected and default 
//inner classes is mainly for controlling the feature and code organizing effectively
//A class is private so it encapsulated its feature only use within the M1 not any other class
//organizing is achieve through the encapsulated without encapsulated organizing is very deficault
//inner class is used for organizing and controlling