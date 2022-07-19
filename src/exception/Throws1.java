package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Throws1 {
	
	void readfile() throws FileNotFoundException {
		FileInputStream fis=new FileInputStream("d:/abc.txt");
		
	}
	void savefile() throws FileNotFoundException {
		FileOutputStream of=new FileOutputStream("d:/xyz.txt");
	}

	public static void main(String[] args)throws FileNotFoundException  {
		Throws1 tr=new Throws1();
		try {
			tr.readfile();
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("ok that it");
			
		}
		try {
			tr.savefile();
		}
		catch(FileNotFoundException  e) {
			e.printStackTrace();
			System.out.println("hello");
			
		}
		
		System.out.println("any other file is present");
		
		
	}

}
