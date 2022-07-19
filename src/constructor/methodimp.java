package constructor;

import accessModifier.Private;

public class methodimp extends Private { 
	 
	      
	public static void main(String[] args) {
		methodimp pr=new methodimp();
	//	Private p1=new Private(); 
	//	p1.m1();.....comple error
		pr.m1();
		System.out.println(pr.data);
      
	} 

}
