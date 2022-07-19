package loosJava;

import java.util.Scanner;

public class Primenumberfor {

	public static void main(String[] args) {
//		int count=0;
//      Scanner sc=new Scanner(System.in);
//      System.out.println("enter the no:");
//      int n=sc.nextInt();
//      for(int i=1;i<=n;i++) {
//    	  if(n%i==0) {    		
//			count++;  		 
//    	  }
//      }if (count==2) {
//    	  System.out.println("given no is prime");
//      }else {
//    	  System.out.println("given no is not prime");
//      }
		int temp=0;
		 Scanner sc=new Scanner(System.in);
	      System.out.println("enter the no:");
	      int n=sc.nextInt();
		for(int i=2;i<=n-1;i++) {
			if(n%i==0) {
				temp=temp+1;
			}
		}if(temp==0) {
			System.out.println("prime no");
		}else {
			System.out.println("not prime no");
		}
	}

}
