package exception;

public class Throw1 {

	public static void main(String[] args)   {
		int age=16;
		try {
		if(age<18) {
			throw new ArithmeticException("you are not eligible");
		
		}else {
			System.out.println("voting please");
		}}
		catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println("please next time");
		}
		System.out.println("thank you!");
	}

}
