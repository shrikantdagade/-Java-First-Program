package encapsulation;

public class Nmberbal  {

	public static void main(String[] args) {
		Balancecheck b1=new Balancecheck();
		b1.checkbal(1234);
      // System.out.println(b1.a);
       b1.setbal(2500);
       b1.checkbal(1234);
	}

}
