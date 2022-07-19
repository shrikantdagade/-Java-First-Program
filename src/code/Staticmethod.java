package code;

import java.util.Scanner;

public class Staticmethod {
 public static int method1(int x,int y) {
	int sum=x+y;
	System.out.println("summition ="+sum);
	return sum;
     }
  public static double method2( double x,double y) {
    double division=x/y;
    System.out.println(division);
    return division;
      }
  public static int method3(int x,int y) { 
	  int mul=x*y;
      System.out.println("multiplicatin =" +mul); 
      return mul; 
      } 
  public void method4(int x,int y){ 
	  int sub =x-y;
      System.out.println("substraction ="+sub);
      }
  
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		int button=sc.nextInt();
		if(button==1) {
		int z=method1(x,y);
		}
		else if (button==2){
		method2(x,y);
		}
		else if(button==3) {
			int s=method3(x,y);
			System.out.println(+s);
		}
		else {
		Staticmethod var=new Staticmethod();
		var.method4(x, y);
	}
	}
}