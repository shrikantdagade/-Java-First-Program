package stringClass;

public class String1 {

	public static void main(String[] args) {
		//using literals
		String name="shrikant";
		
		String nickname="SHRIKANT";
		//content comparison
		System.out.println(name.equals(nickname));
		//object comparison
		System.out.println(name==nickname);
		
		System.out.println(name.equalsIgnoreCase(nickname));
		
		System.out.println(name.toUpperCase());
		
		System.out.println(nickname.toLowerCase());

		System.out.println(name.length());
		
		System.out.println(name.charAt(2));
		//using new keyword
		String name1=new String("shrikant");
		//content checking
		System.out.println(name.equals(name1));
		//object checking
		System.out.println(name==name1);
		
		String name2 =new String("shrikant");
		
		System.out.println(name1.equals(name2));
		System.out.println(name1==name2);
		
		System.out.println(name.equalsIgnoreCase(name2));

	}

}
