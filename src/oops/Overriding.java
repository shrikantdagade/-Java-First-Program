package oops;

public class Overriding {
      public void marry() {
    	  System.out.println("marry to katrina");
      }
}
 class Override extends Overriding{
	 public void marry() {
		System.out.println("marry to sanjana");
	}

	
	public static void main(String[] args) {
	
		
		Overriding s=new Overriding();
		s.marry();
		Override v=new Override();
		v.marry();
		//v.marry1();
		Overriding s1=new Override();
		s1.marry();
	}}


