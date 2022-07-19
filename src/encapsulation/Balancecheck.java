package encapsulation;

public class Balancecheck extends Account {
	   int a=45;
	 public void checkbal(int no ) {
		System.out.println( super.getbalance(no));
		 
	 }
    public void setbal(double amount) {
    	super.setbalance(amount);
    }
	public static void main(String[]args) {
		 Balancecheck as=new  Balancecheck();
		System.out.println(as.getbalance(123));
		 as.setbal(100);
		 System.out.println(as.getbalance(123));
		 
		 Account aa=new Balancecheck();
	  System.out.println(	 aa.getbalance(12));
	}
		
	}

	 
	 