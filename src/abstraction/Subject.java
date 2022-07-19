package abstraction;

public class Subject extends Language{
     public Subject(int a,String c) {
		super(a,c);
		System.out.println(super.a=a);
		System.out.println(super.s=c+" "+super.a);
	}

	public void method() {
    	 System.out.println("method of subclass");
     }

	@Override
	public void display() {
		System.out.println("hello");
		
	}
 
 
	
	public static void main(String[] args) {
		Subject s =new Subject(10,"mahi");
		s.show();
        s.display();
        s.method();
        System.out.println(s.a+" "+s.s);
		/*
		 * Language l= new Subject(); l.show(); l.display();
		 */
        
       
	}
	
		
	}


