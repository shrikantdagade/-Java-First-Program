


public class Printnumber1to100 {
   
	public void name(int Number) {
		if (Number<=100) {
			System.out.println(Number);
			Number++;
			name(Number);
		}}
	
	public static void printnumber(int a ,int b) {
		if(a<=b) {
			System.out.println(a);
			a++;
			printnumber(a, b);
		}
	}
	public static void main(String[]args) {
		Printnumber1to100 na= new Printnumber1to100();
		na.name(1);
		printnumber(1, 100);
		
		if(System.out.printf("hello world")==null) {
			
		}
		if(System.out.append("hello world")==null) {
			
		}
		
	}	
		
		
		
		
		
	}

