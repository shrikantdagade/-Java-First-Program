package code;

import java.util.Scanner;

public class LeapYearfind {

	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the year:");
      long year=sc.nextLong();
	
//		 if(year%400==0)
//		      { System.out.println(year+"is a leap year"); 
//		  }else if(year%100==0)
//		      { System.out.println(year+"is not a leap year"); 
//		  }else if(year%4==0) 
//		      { System.out.println(year+"is a leap year"); 
//		  }else 
//		      {System.out.println(year+"is not a leap year"); 
//		  }  
      if((year%400==0)||((year%4==0)&&(year%100!=0))) {
    	  System.out.println(year+ "is a leap year");
      }else {
    	  System.out.println(year+ "is not a leap year");
      }
	}

}

