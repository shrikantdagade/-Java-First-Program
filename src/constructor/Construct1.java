package constructor;
public class Construct1 {
     String name;
     int rollno;
     char div;
	public Construct1 (String name,int a,char b) {
	
	
	this .	name=name;
		this.rollno=a;
		this.div=b;
	System.out.println("shrikant");
	System.out.println(name);
	System.out.println(name+" "+rollno+" "+div);
	}
	Construct1 (String s,int d){
		this(10);
		this.name=s;
		this.rollno=d;
		System.out.println("my name is shrikant");
		System.out.println(name+" "+rollno);
		
	}
	Construct1 (int s){
		System.out.println(s);
		System.out.println("all is well");
	}
	public void method1(){
		System.out.println("ok its done");
		System.out.println(name+" "+rollno);
	}
	public static void main(String[] args) {
		Construct1 ref=new Construct1 ("sachin",10,'a');
		Construct1 var=new Construct1("shrikant",20);
        ref.method1();
        var.method1();
	}

}
