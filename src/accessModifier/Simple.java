package accessModifier;

public class Simple extends Private  {
	 protected void m1() {
		System.out.println("helloo world");
	}

	public static void main(String[] args) {
		Private p1=new Simple(); 
		p1.m1(); 
		System.out.println(p1.data);
		Simple p2=new Simple(); 
		p2.m1();
	}

}
