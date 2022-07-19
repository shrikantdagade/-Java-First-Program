package stringClass;

public class Practicestring {

	public static void main(String[] args) {
	    //using literal
		String name="SHrikant xyz";
		String name1="";
		//ussing new keyword
		//String name1=new String("shrikant");
		System.out.println(name.length());
		System.out.println(name.charAt(7));
		
		System.out.println(name.equals(""));
		System.out.println(name.equalsIgnoreCase(name1));
		System.out.println(name==name1);
		System.out.println(name.compareToIgnoreCase(name1));
		System.out.println(name.indexOf("t"));
		System.out.println(name.lastIndexOf('t'));
		System.out.println(name.contains("Hr"));
		System.out.println(name.startsWith("S"));
		System.out.println(name.endsWith("z"));
	}

}
