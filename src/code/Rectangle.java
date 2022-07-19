package code;

public class Rectangle {
int length;
int width;
void display() {
	System.out.println("Rectangle length="+length);
	System.out.println("Rectangle width="+width);
}
void output() {
	System.out.println("Area="+(length*width));
}

	public static void main(String[] args) {
Rectangle l1,w2;
l1 =new Rectangle();
w2=new Rectangle();
l1.length=11;
l1.width=5;
System.out.println("calculate Area of Rectangle");
l1.display();
l1.output();
w2.length=102;
w2.width=52;
System.out.println("calculate Area of Rectangle");
w2.display();
w2.output();
	}
}
