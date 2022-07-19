package exception;

public class Throws2 {
	void method() throws InterruptedException {
		throw new InterruptedException("device error");
	}

	public static void main(String[] args) {
		Throws2 ss=new Throws2();
		try{
			ss.method();
		}
		catch(InterruptedException s) {
		
			System.out.println("hi");
		}
         System.out.println("hello");
	}

}
