package code;

import java.util.Scanner;

public class Area {
int length;
int width;
void input()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter length of rectangle=");
	length=sc.nextInt();
	System.out.println("enter width of rectangle=");
	width=sc.nextInt();
}
void output()
{
	System.out.println("Total area of rectangle="+(length*width));

}
	public static void main(String[] args) {
Area rectangle=new Area();
rectangle.input();
rectangle.output();
	}

}
