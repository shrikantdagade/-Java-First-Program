package exception;

public class YoungerAgeException extends RuntimeException {
	YoungerAgeException(String msg){
		super(msg);
	}
	public static void main(String[] args)   {
		int age=16;
		try {
		if(age<18) {
			throw new YoungerAgeException("you are not eligible");
		
		}else {
			System.out.println("voting please");
		}}
		catch (YoungerAgeException e) {
			System.out.println("please next time");
			e.printStackTrace();
		}
		System.out.println("thank you!");
	}
}
