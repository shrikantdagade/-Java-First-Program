package oops;

import accessModifier.Private;

public class Mypack extends Private {

	public static void main(String[] args) {
		 Private p1=new Private();
       // p1.m1();
		// System.out.println(p1.data);
		 Mypack s1=new Mypack();
		 s1.m1();
		 System.out.println(s1.data);
	}

}
