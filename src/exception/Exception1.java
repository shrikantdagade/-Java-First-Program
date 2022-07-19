package exception;

public class Exception1 {

	public static void main(String[] args) {
     int a=10;
     int b=0;
     int c;
     try {
    	 c=a/b; 
         System.out.println(c);

     }
     catch(ArithmeticException e) {
    	 System.out.println("cant divide by zero");
    	// e.printStackTrace();
     }
     
     System.out.println("hello");
	}

}
