package code;

import java.util.Scanner;
//comment line
public class Add {
	int a,b;
	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first no.=");
		a=sc.nextInt();
		System.out.println("enter second no.=");
         b=sc.nextInt();
}
	void output()
	{
		System.out.println("Addition of two no. ="+(a+b));
	}
	public static void main(String[] args) {
		Add aa = new Add();
		aa.input();
		aa.output();

	}

}
