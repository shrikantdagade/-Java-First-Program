package abstraction;

public abstract class Language {
 int a;
 String s;
 public abstract void display();
 public Language(int a ,String b) {
	 this.a=a;this.s=b;
	 System.out.println("this is constructor");
	 System.out.println(a+" "+s);
 }
 public void show() {
	 a=25; s="shrikant";
	 System.out.println("this is showing something");
	 System.out.println(s+" "+a);
 }
 public static void main(String[]args) {
//	 Language l= new Language();
 }
}
