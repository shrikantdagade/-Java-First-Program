package code;

public class Localtoinstance {
int a;
char b;

	public static void main(String[] args) {
		int y=45;
		char z='A';
		System.out.println(y);
		System.out.println(z);



Localtoinstance v1=new Localtoinstance();
System.out.println(v1.a);
System.out.println(v1.b);

v1.a=y;
v1.b=z;
System.out.println(v1.a);
System.out.println(v1.b);
	}

}
