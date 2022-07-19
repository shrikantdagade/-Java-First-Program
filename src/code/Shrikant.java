package code;

public class Shrikant {
	int age=45;
static	int weight=50;
	 String colour="dark";
	 public	 void eat()
	 {
System.out.println("i am eating");
	 }
	 public  void sleep()
	 {
		 System.out.println("i am sleeping");
	 }
	 
	 public static void main(String[] args) {
		// TODO Auto-generated method stub
Shrikant s=new Shrikant();
System.out.println(s.age);
System.out.println(weight);
System.out.println(s.colour);
weight=80;
weight=90;
System.out.println(weight);
s.eat();
s.sleep();
	}

}
