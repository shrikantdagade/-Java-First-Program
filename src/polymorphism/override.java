package polymorphism;

public class override extends overlooad {
	public void method1() {
		System.out.println("jay ho");
	}
	public float method1(int a,String s) {
		System.out.println("ok");
		return 3;
	}

	public static void main(String[] args) {
	   override oo=new override();
	   oo.method1();
       oo.method1(10);
       oo.method1(20,"datta");
       overlooad dd=new overlooad();
       dd.method1();
       dd.method1(10);
       dd.method1(23,"marry");
       overlooad ss=new override();
       ss.method1();
       ss.method1(10,"shri");
	}

}
