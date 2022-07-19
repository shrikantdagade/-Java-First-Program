package constructor;

public class Construct2 {
     String name;
     int age;
     long id;
     char div;
     Construct2(String name){
    	 System.out.println("constructor with one argument-string:"+name);
     }
     Construct2(String name,int age){
    	 System.out.println("construcotr with two argiment-string and integer:"+name+" "+age);
     }
     Construct2(String name,int age, long id){
    	 System.out.println("constructor with three argument- string integer and long:"+name+" "+age+" "+id);
     }
     Construct2(char div){
    	 System.out.println("construcottr with one argument with differrent types-char:"+div);
     }
	public static void main (String[]args) {
		Construct2 s1 =new Construct2("jaykant");
		Construct2 s2 =new Construct2("jaykant",24);
		Construct2 s3 =new Construct2("jaykant",25,1212);
		Construct2 s4 =new Construct2('S');

	}

}
