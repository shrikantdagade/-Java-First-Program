package code;

public class Localtostatic {
	static int k;
	static String a;

	public static void main(String[] args) {
System.out.println(k);
System.out.println(a);
int k=50;
String p="shrikant";
k=k;
a=p;
System.out.println(k);
System.out.println(a);

	}

}
