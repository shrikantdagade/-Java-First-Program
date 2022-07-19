package oops;

public class Dog1 extends Animal{
	public void bark() {
    	System.out.println("barking");
    }

	
	public static void main(String[] args) {
      Dog1 d=new Dog1();
      d.bark();
      d.eat();
      d.run();
 
      
	}

}