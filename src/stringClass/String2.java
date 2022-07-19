package stringClass;

import java.util.Scanner;

public class String2 {

	public static void main(String[] args) {
		String name;
		int count=0;
		System.out.println("enter the name:");
        Scanner sc=new Scanner(System.in);
        name=sc.next();
        for(int i=0;i<name.length();i++) {
        	if(name.charAt(i)!=' ') {
        		count++;
        }
        	System.out.println(count);
	}

}}