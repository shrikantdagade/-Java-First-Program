package oops;



public class Multipleinheritance {
	  public void print_geek()
	    {
	        System.out.println("Geeks");
	    }
	}
class two extends Multipleinheritance {
    public void print_for()
    { 
    	System.out.println("for");
    	}

}
class three extends two {
    public void print_geek()
    {
        System.out.println("Geeks");
    }
	  

	// Drived class
	
	    public static void main(String[] args)
	    {
	    	three g = new three();
	    	 two t=new two();
	         g.print_geek();
	         g.print_for();
	         g.print_geek();t.print_for();
	    }
	       
	    }
	
     
	


