package code;

import java.util.Scanner;

public class SwitchCaseWithFunction {
	
	public void environment(String env) {
		
		switch(env) {
		case"DIT":System.out.println("URL=www.dittest.com");
		break;
		case"SIT":System.out.println("URL=WWW.sittest.com");
		break;
		case "UIT":System.out.println("URL=www.uattest.com");
		break;
		}
		return;
	}

	public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      System.out.println("enter the month:");
      String month=sc.next();
      String env=sc.next();
      switch(month) {
      case "january":System.out.println("this is 1st month");
      break;
      case "february":System.out.println("this is 2st month");
      break;
      case "march":System.out.println("this is 3rd month");
      break;
      case "aprii":System.out.println("this is 4th month");
      break;
      case "may":System.out.println("this is 5th month");
      break;
      case "june":System.out.println("this is 6th month");
      break;
      case "july":System.out.println("this is 7th month");
      break;
      case "august":System.out.println("this is 8th month");
      break;
      case"september":System.out.println("this is 9th month");
      break;
      case"octomber":System.out.println("this is 10th month");
      break;
      case"november":System.out.println("this is 11th month");
      break;
      case"deccember":System.out.println("this is 12th month");
      break;
      default:System.out.println("no month avilable");
      }
      SwitchCaseWithFunction var=new  SwitchCaseWithFunction();
      var.environment(env);
	}

}
