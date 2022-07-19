package oops;

public class Overloding {
         Overloding(int a) {
        	System.out.println("testing is required");
        }
         Overloding(int a,String s) {
	    	System.out.println("testing too much required");
	    }
	    public void test(int s) {
	    	System.out.println("testing also required");
	    	
	    }
	    public String test(String s) {
	    	return s;
	    	
	    }
	    public static void main(int c) {
	    	System.out.println("yes we can overload");
	    	
	    }
	 
	public static void main(String[] args) {
             Overloding s=new Overloding(10,"shri");
             s.test(10);
         
             main(10);
	}  

}
