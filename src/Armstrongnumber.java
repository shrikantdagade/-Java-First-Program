import java.util.Scanner;

public class Armstrongnumber {

	public static void main(String[] args) {
		int n;
		int arm=0;
		System.out.println("Enter the number:");
		Scanner sc =new Scanner(System.in);
		n=sc.nextInt();
        int c=n;
		
		while(n>0) {
			int rem = n%10;
			arm = (rem*rem*rem)+arm;
			n=n/10;
		}
		System.out.println(arm);
		if(c==arm) {
			System.out.println("it is armstrong number");
		}else {
			System.out.println("not a armstrong number");
		}
	}

}
