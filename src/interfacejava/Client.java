package interfacejava;

import java.util.Scanner;

public interface Client {
      int a=45;
      void input();
      void output();
	
}
 class developer implements Client{
    String name;
    double salary;
	@Override
	public void input() {
		Scanner sc =new Scanner (System.in);
		System.out.println("enter the name");
		name=sc.next();
		System.out.println("enter the salary");
		salary=sc.nextDouble();
	}  
	@Override
	public void output() {
		System.out.println(name+" "+salary);
		
	}
    public static void main(String[]args) {
    	developer d=new developer();
    	d.input();
    	d.output();
    	System.out.println(d.a);
    	
    	
    }
	
}