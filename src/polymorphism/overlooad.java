package polymorphism;

public class overlooad {
	public void method1() {
		System.out.println("hi");
	}
	public int method1(int a) {
		System.out.println("hello");
		return 1;
		
	}
	public float method1(int a,String s) {
		System.out.println("namste");
		return 2;
	}

	public static void main(String[] args) {
		overlooad aa=new overlooad();
		aa.method1();
        aa.method1(10);
        aa.method1(10,"shri");
	}

}
