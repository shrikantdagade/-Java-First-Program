package code;

public class Instancetolocal {
	int a=50;
	double b=45.60;

	public static void main(String[] args) {
		
		Instancetolocal v1=new Instancetolocal();
		int y=v1.a;
		double z=v1.b;
		System.out.println(y);
		System.out.println(z);
		 System.out.println("Local Variable " + y);
	}

}
