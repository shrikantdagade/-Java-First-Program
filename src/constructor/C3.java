package constructor;

public class C3 extends P2 {
	int y=10;
	public C3(int b ,int c) {
		
		System.out.println("no args");
	}
	public C3(int a,String d ) {
		
		System.out.println("C3 constructor");
	}
   public void m1() {
	   System.out.println(" this");
   }
	public static void main(String[] args) {
		C3 ref =new C3(10,"fjf");
		
		System.out.println(ref.x);
	}

}
