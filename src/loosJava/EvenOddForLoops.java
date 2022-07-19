package loosJava;

import java.util.Scanner;

public class EvenOddForLoops {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("even number upto:");
	    int n=sc.nextInt();
	    for(int i=0;i<=n;i++) {
	    	if(i%2==0) {
	    		System.out.print(i+",");
	    	}
	    } System.out.println("");
	
	    System.out.println("odd number upto:");
	    int c=sc.nextInt();
	    	 for(int i=0;i<=n;i++) {
	    		 if(i%2!=0) {
	    			 System.out.print(i+",");
	    		 }
	    	 }
	}
}

