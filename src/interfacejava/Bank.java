package interfacejava;

public interface Bank {
	float rateofinterest();
	}
	class SBI implements Bank{
	  public float rateofinterest(){
	   return 7.2f;
	}}
	class HDFC implements Bank{
	public  float rateofinterest(){
	return 9.2f;
	}
	public static void main(String []args)
	{
	  SBI b=new SBI();
	  System .out .println( b.rateofinterest());
	  HDFC b1 =new HDFC();
	   System .out .println( b1.rateofinterest());
	 }
	} 





