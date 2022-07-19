package interfacejava;

public interface Shape {
		 int a=45;
		 void draw();
		 default void m1() {
			 System.out.println("hello");
			
		 }
		 static void m2(int a) {
		    	System.out.println("hiiii");
		    }
		}
		interface Table extends Shape{
		double d=12.3;
	    void createtable();
	    static void m2(int a) {
	    	System.out.println("hi");
	    	
	    }
		}

		class Prepare implements Shape,Table{
		 public void draw (){
		 System.out.println("creating a shape of circle");
		 System.out.println(Shape.a);  
		}
		 public void createtable(){
		  System.out.println("create a table of number 2");
		  System.out.println(Table.d);
		}
		public static void main (String[]args){
			 Prepare p=new Prepare();
		   p.draw();
		   p.createtable();
		   p.m1();
		   Shape.m2(2);
		   Table.m2(a);
		 System.out.println(p.a);
		 System.out.println(p.d);
		}

		}





