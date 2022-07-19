import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
	int n1, n2;
	int ch;
	System.out.println("enter the first no:");
	Scanner sc= new Scanner (System.in);
    n1=sc.nextInt();
    System.out.println("enter the second no:");
    n2=sc.nextInt();
    System.out.println("select operation:");
    ch=sc.nextInt();
    
    if(ch==1) {
    	  int sum=n1+n2;
    	  System.out.println("addition="+sum);
    }
    else if(ch==2){ 
    		  int mul=n1*n2;
    		  System.out.println("multiplication="+mul);
     }else if(ch==3) {
    		  double div=n1/n2;
    		  System.out.println("division="+div);
     }else if(ch==4) {
    		  int sub=n1-n2;
    		  System.out.println("substraction="+sub);
    }
    else {
    	  int rem=n1%n2;
		  System.out.println("reminder="+rem);
    }
    	
    }
}
