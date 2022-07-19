package finalclass;

public class Honda extends Bike{
	  
      public  Honda(){
        super(10);
        	System.out.println("construcotr");
        	System.out.println(super.speedlimit);
        }
	   public void fun() {
		   System.out.println(super.speedlimit);
		   System.out.println("running with honda ");
	   }
	public static void main(String[] args) {
		 Honda  h=new Honda();
	  h.run();
     h.fun();
	}

}
